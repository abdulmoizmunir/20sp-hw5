package edu.upenn.cis350.hw5.math;

import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NullArgumentException;

import org.junit.Test;

public class MyFractionsTest {

    @Test(expected = NullArgumentException.class)
    public void testF1NullF2Null() {
        MyFractions.addSub(null, null, false);
    }

}
