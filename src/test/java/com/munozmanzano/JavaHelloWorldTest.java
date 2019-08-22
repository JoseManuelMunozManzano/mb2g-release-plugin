package com.munozmanzano;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {

        System.out.println(new JavaHelloWorld().getHello());
    }
}