package edu.upenn.cis350.hw5.donation;

public class DonationManager {
    
    private FundManager fundManager;
    private UserManager userManager;
    
    public DonationManager(FundManager fm, UserManager um) {
        fundManager = fm;
        userManager = um;
    }
    
    /*
     * Note that you are NOT being asked to implement this method.
     * You are being asked to write tests for it, based on its specification.
     * This code is only provided so that your tests will compile!
     */
    public double donate(String user, String fund, double amount) {
        return -1;      
    }

}
