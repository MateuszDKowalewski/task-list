package com.gmail.aspoka1;

class HelloService {
    static final String DEFAULT_NAME = "world";

    String prepreGreeting(String name){
        return "Hello " + ((name == null) ? DEFAULT_NAME : name) + "!!";
    }
}
