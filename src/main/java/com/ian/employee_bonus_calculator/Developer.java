package com.ian.employee_bonus_calculator;

/**
 *
 * @author Ian Tagano
 */

//class representing the developer, extending the employee super class
public class Developer extends Employee
{
    //private variables to stored bonus multiplier for the developer
    private double bonusMultiplier;
    
    
    //constructor for the developer to initialize name, base salary and bonus multiplier
    public Developer(String name, double baseSalary, double bonusMultiplier)
    {
        //call the super class constructor to initialize the name and the base salary
        super(name, baseSalary);
        this.bonusMultiplier = bonusMultiplier;        
    }
    
    
    //getter methods to retriever bonus multiplier
    public double getBonusMultiplier()
    {
        return bonusMultiplier;
    }
    
    
    //override the calculate bonus from the super class based on the bonus percentage
    @Override
    public double calculateBonus()
    {
        //getBaseSalary, since the developer inheret the superclass he can now access this method as one of its function
        return getBaseSalary() * bonusMultiplier;
    }
}
