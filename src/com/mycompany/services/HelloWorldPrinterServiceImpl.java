package com.mycompany.services;

import com.mycompany.domain.HelloWorld;
import com.mycompany.interfaces.HelloWorldPrinterInterface;

public class HelloWorldPrinterServiceImpl implements HelloWorldPrinterInterface {
    @Override
    public void printHelloWorld(HelloWorld helloWorld) {
        System.out.println(helloWorld);
    }
}
