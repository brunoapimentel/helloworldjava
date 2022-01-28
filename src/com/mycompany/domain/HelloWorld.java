package com.mycompany.domain;

public class HelloWorld {
    private String myName;

    public HelloWorld(String myName) {
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }

    @Override
    public String toString() {
        return myName;
    }
}
