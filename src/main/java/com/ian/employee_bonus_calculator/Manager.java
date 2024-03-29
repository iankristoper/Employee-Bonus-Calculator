package com.ian.employee_bonus_calculator;

/**
 *
 * @author Ian Tagano
 */

// Class representing a manager, extending the Employee class
public class Manager extends Employee 
{
    // Private variable to store bonus percentage for the manager
    private double bonusPercentage;
    
    
    // Constructor to initialize manager's name, base salary, and bonus percentage
    public Manager(String name, double baseSalary, double bonusPercentage) 
    {
        // Call the superclass constructor to initialize name and base salary
        super(name, baseSalary);
        this.bonusPercentage = bonusPercentage;       
    }
    
    
    // Getter method to retrieve the manager's bonus percentage
    public double getBonusPercentage() 
    {
        return bonusPercentage;
    }
    
    
    // Override the calculateBonus method to calculate bonus based on bonus percentage
    @Override 
    public double calculateBonus() 
    {
        //since the manager inheret the superclass, he can now also acces the getBaseSalary method
        return getBaseSalary() * (bonusPercentage / 100);
    }
}