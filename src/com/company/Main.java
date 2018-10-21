package com.company;

public class Main {

    public static void main(String[] args) {
        Human adam = new Human("adam",true);
        Human eva = new Human("eva",false);
        God.say("dont eat that apple, poison");
        Snake snake = new Snake();
        snake.say("delisious, no poison");
        Apple apple = new Apple(5);
        while(!apple.isEmpty()){
            adam.eat(apple);
            System.out.println("adam eated 1");
            if(!apple.isEmpty()){
                eva.eat(apple);
                System.out.println("eva eated 1");
            }
        }
        System.out.println("all apple be eated ");
        adam.sleep();
        eva.sleep();
        God.say("Eva! have to listen to husband... and get a children");
        God.say("Adam! u have to make a farm");
    }
}
