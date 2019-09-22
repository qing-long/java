package com.lan.duck;


public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public String duckName;

    public abstract String display();


    public Boolean swim() {
        return true;
    }


    public Boolean fly() {
        return flyBehavior.fly();
    }

    public String quack() {
        return quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }


}
