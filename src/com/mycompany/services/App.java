package com.mycompany.services;

import com.mycompany.domain.HelloWorld;
import com.mycompany.factory.HelloWorldFactory;
import com.mycompany.interfaces.HelloWorldPrinterInterface;

public class App {
    private HelloWorld helloWorld;
    private HelloWorldPrinterInterface helloWorldPrinter;

    public App(HelloWorld helloWorld, HelloWorldPrinterInterface helloWorldPrinter) {
        this.helloWorld = helloWorld;
        this.helloWorldPrinter = helloWorldPrinter;
    }

    public static App bootstrap(){
        HelloWorld helloWorld = HelloWorldFactory.build();
        HelloWorldPrinterInterface helloWorldPrinter = new HelloWorldPrinterServiceImpl();

        return new App(helloWorld, helloWorldPrinter);
    }

    public void run() {
        this.helloWorldPrinter.printHelloWorld(this.helloWorld);
    }
}
