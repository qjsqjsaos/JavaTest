package com.example.javatest;

//public class Human {
//    String name;
//    int age;
//
//    public Human(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Human() { }
//
//    public void changeName(String name) {
//        this.name = name;
//    }
//
//    public void changeAge(int age) {
//        this.age = age;
//    }
//}

public class Human {
    String name;
    int age;

    //복사 생성자
    public Human(Human human) {
        this.name = human.name;
        this.age = human.age;
    }

    public Human() {
        this("sooyeol", 26);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //복사 팩토리
    public static Human newInstance(Human human) {
        Human h = new Human();
        h.name = human.name;
        h.age = human.age;
        return h;
    }
}

class Main {
    public static void main(String[] args) {
        //복사 생성자
        Human human = new Human();
        Human human2 = new Human(human);

        human2.age = 30;
        human2.name = "minsoo";

        System.out.println(human);
        System.out.println(human2);


        //복사 팩토리
        Human human3 = new Human();
        Human human4 = Human.newInstance(human3);
    }

//    public static void shallowCopy() {
//        Human human = new Human("sooyeol", 26);
//        Human humanCopy = human;
//
//        human.changeName("minsoo");
//        human.changeAge(30);
//
//        System.out.println(human.age);
//        System.out.println(human.name);
//        System.out.println(humanCopy.age);
//        System.out.println(humanCopy.name);
//    }


//    public void deepCopy() {
//        Human human = new Human("sooyeol", 26);
//        Human humanCopy = new Human();
//    }
}

