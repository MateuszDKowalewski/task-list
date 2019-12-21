package com.gmail.aspoka1;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table( name = "languages" )
public class Lang {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Integer id;
    private String greeting;
    private String code;

    /**
     * Hibernate needs it
     */
    @SuppressWarnings("unused")
    Lang() {

    }

    public Lang(Integer id, String greeting, String code) {
        this.id = id;
        this.greeting = greeting;
        this.code = code;
    }

    public Integer getId() {
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
