package com.ian.employee_bonus_calculator;

/**
 *
 * @author Ian Tagano
 */

// Abstract class representing an employee this is the super class
public abstract class Employee 
{
    // Private variables to store employee name and base salary
    private String name;
    private double baseSalary;
    
    
    // Constructor to initialize the employee name and base salary
    public Employee(String name, double baseSalary) 
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    
    // Getter method to retrieve the employee name
    public String getName() 
    {
        return name;
    }
    
    // Getter method to retrieve the employee base salary
    public double getBaseSalary() 
    {
        return baseSalary;
    }
    
    
    // Abstract method to calculate bonus, to be implemented by subclasses
    public abstract double calculateBonus();
}