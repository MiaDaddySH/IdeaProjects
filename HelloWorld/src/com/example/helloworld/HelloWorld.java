package com.example.helloworld;

import java.util.Enumeration;
import java.util.Properties;

public class HelloWorld {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        Enumeration keys = props.propertyNames();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            System.out.println(key + "=" + props.getProperty(key));
        }
        // System.out.println("Hello World, Martin!");

        //int sum = sum(2,4);
        //System.out.println(sum);

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
