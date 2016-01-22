/**
 * Created by dvlaev on 21.01.2016.
 */
package com.javafortesters.chap003myfirsttest.examples;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer);
        }

    @Test
    public void canDivFourAndTwo(){
        int answer = 4/2;
        assertEquals("4/2=1", 2, answer);
    }

    @Test
    public void canMultiplyTwoAndTwo(){
        int answer = 2*2;
        assertEquals("2*2=4", 4, answer);
    }

    @Test
    public void canMinusTwoAndTwo(){
        int answer = 2-2;
        assertEquals("2-2=0", 0, answer);
    }
}
