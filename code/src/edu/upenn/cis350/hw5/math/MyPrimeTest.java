package edu.upenn.cis350.hw5.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyPrimeTest {

    @Test
    public void test1() {
        assertEquals(2, MyPrime.nextPrime(1));
    }

}
