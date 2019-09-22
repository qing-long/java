package com.lan.duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setFlyBehavior(new FlyNoWay());
    }


    @Override
    public String display() {
        return "green had";
    }
}
