package edu.upenn.cis350.hw5.donation;

public interface UserManager {
    
    public boolean isValidUser(String name);
    
    public double getBalance(String name);

}
