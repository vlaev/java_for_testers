package com.javafortesters.domainobject;

/**
 * Created by dvlaev on 21.01.2016.
 */
public class User {
    private String username;
    private String password;

    public User(){
        username = "username";
        password = "password";
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}
