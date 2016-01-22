package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainobject.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dvlaev on 21.01.2016.
 */
public class UserTest {
    @Test
    public void canConstrucANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){

        User user = new User();

        assertEquals("default username expected",
                "username",
                user.getUsername());

        assertEquals("default password expected",
                "password",
                user.getPassword());
    }
}
