package edu.upenn.cis350.hw5.math;

import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NullArgumentException;

import org.junit.Test;

import edu.upenn.cis350.hw5.math.MySorter.OrderDirection;

public class MySorterTest {

    @Test(expected = NullArgumentException.class)
    public void testNullInputs() {
        MySorter.sortInPlace(null, OrderDirection.DECREASING, (double[]) null);
    }
    
}
