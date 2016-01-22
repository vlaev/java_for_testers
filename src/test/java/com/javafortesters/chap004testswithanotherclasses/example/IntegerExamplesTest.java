/**
 * Created by dvlaev on 21.01.2016.
 */
package com.javafortesters.chap004testswithanotherclasses.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {
    @Test
    public void integerExploration(){
        Integer four = 4;
       // Integer some = new Integer();
        assertEquals("intValue returns int 4",
                4, four.intValue());

        Integer strfive = new Integer("5");
        assertEquals("intValue returns int 5",
                5, strfive.intValue());
    }

    @Test
    public void toHexString(){
        assertEquals("11 in Hex becomes b", "b", Integer.toHexString(11));
    }

    @Test
    public void intValues(){
        assertEquals("min int is -2147483648", -2147483648, Integer.MIN_VALUE);
        assertEquals("max int is 2147483647", 2147483647, Integer.MAX_VALUE);
    }

}
