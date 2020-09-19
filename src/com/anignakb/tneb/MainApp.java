package com.anignakb.tneb;

import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * This program is used for calculating TNEB Tariff Calculator
 * @author anthoniraj
 * @since 2020-09-17
 * @version 1.0
 */
public class MainApp {
    /**
     * This method is used for calculating tariff
     * @param units method takes units as a parameter
     * @return double method returns totalCost
     */
    private double calculateTariff(int units){
        double fixedCharge = 0, totalCost = 0;
        if(units >=0 && units <=100){
            totalCost = 0;
        }else if(units > 100 && units <=200){
            fixedCharge = 20.0;
            totalCost = (100 * 0) + ((units - 100) * 1.50) + fixedCharge;
        }else if(units > 200 && units <=500){
            fixedCharge = 30.0;
            totalCost = (100 * 0) + (100 * 2.00) + ((units - 200) * 3.00) + fixedCharge;
        }else if(units > 500){
            fixedCharge = 50;
            totalCost = (100 * 0) + (100 * 3.50) + (300 * 4.60) + ((units - 500) * 6.60) + fixedCharge;
        }
        return totalCost;
    }

    /**
     * This is the main method
     * @param args unused
     */
    public static void main(String[] args) {
        String flag;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter consumed units: ");
            int consumedUnits = in.nextInt();
            if (consumedUnits >= 0) {
                MainApp app = new MainApp();
                System.out.println("The total cost is " + app.calculateTariff(consumedUnits));
            } else {
                System.out.println("Enter the valid units!");
            }
            System.out.println("Do you want to calculate again? (Type Yes/No)");
            flag = in.next().toUpperCase();
        }while(flag.equals("YES"));
    }
}
