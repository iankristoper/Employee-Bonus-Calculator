package com.ian.employee_bonus_calculator;

/**
 *
 * @author Ian Tagano
 */


public class Employee_Bonus_Calculator 
{

    public static void main(String[] args) 
    {
        //creting instance of Employee superclass but using the Manager and Developer as an objects
        Employee manager = new Manager("John Doe", 5000, 15);
        Employee developer = new Developer("Jane Smith", 4000, 0.1);
        
        
        System.out.println("Manager:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Base Salary: $" + manager.getBaseSalary());
        System.out.println("Bonus Percentage: " + ((Manager) manager).getBonusPercentage() + "%");
        System.out.println("Bonus: $" + manager.calculateBonus());

        System.out.println("\nDeveloper:");
        System.out.println("Name: " + developer.getName());
        System.out.println("Base Salary: $" + developer.getBaseSalary());
        System.out.println("Bonus Multiplier: " + ((Developer) developer).getBonusMultiplier());
        System.out.println("Bonus: $" + developer.calculateBonus());
    }
}
