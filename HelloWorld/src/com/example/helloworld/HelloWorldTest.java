package com.example.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void sum() {
        HelloWorld hw = new HelloWorld();
        int sumValue = hw.sum(2,5);
        assertEquals(sumValue, 7);
    }
}