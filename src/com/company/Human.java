package com.company;

public class Human {
    private String name;
    private boolean gender;
            //true:male false: female;
    private int age;
    public Human(){}
    public Human(String name, boolean gender){
        this.name = name;
        this.gender = gender;
    }
    public void say(String words){
        System.out.println(words);
    }
    public void eat(Apple food){
        food.weight--;
    }
    public void sleep(){
        System.out.println("zzZZ");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }
    public boolean getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
