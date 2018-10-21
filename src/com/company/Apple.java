package com.company;

public class Apple {
    public int weight;
    public Apple(){}
    public Apple(int weight){
        this.weight = weight;
    }
    public boolean isEmpty(){
        if(weight<=0)return true;
        return false;
    }
}
