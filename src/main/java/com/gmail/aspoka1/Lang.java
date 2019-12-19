package com.gmail.aspoka1;

public class Lang {
    private Long id;
    private String greeting;
    private String code;

    public Lang(Long id, String greeting, String code) {
        this.id = id;
        this.greeting = greeting;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
