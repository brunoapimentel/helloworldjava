package com.mycompany.factory;

import com.mycompany.domain.HelloWorld;

public class HelloWorldFactory {
    public static HelloWorld build() {
        HelloWorld helloWorld = new HelloWorld("Hello World!");
        return helloWorld;
    }
}
