package com.lan.duck;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestMallarDuck {

    private MallardDuck mallarDuck = new MallardDuck();

    @Test
    public void TestSwim() {
        assertEquals(true, this.mallarDuck.swim());
    }

    @Test
    public void TestFly() {
        assertEquals(false, this.mallarDuck.fly());
    }

}
