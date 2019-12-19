package com.gmail.aspoka1;

class HelloService {
    static final String FALLBACK_NAME = "world";

    String prepreGreeting(String name){
        return "Hello " + ((name == null) ? FALLBACK_NAME : name) + "!";
    }
}
