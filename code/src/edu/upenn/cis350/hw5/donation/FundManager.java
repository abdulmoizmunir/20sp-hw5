package edu.upenn.cis350.hw5.donation;

public interface FundManager {
    
    public boolean isValidFund(String name);
    
    public double getFundTarget(String name);
    
    public double getFundBalance(String name);

}
