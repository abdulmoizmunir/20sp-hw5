package edu.upenn.cis350.hw5.donation;

import static org.junit.Assert.*;

import org.junit.Test;

public class DonationManagerTest {

    /*
     * This is an example of how to write a test that expects to throw an exception
     */
    @Test(expected = IllegalStateException.class)
    public void testFundManagerNullUserManagerNull() {
        new DonationManager(null, null).donate("testUser", "testFund", 30);
    }
    
    /* WRITE YOUR OTHER TESTS HERE! */

}
