package com.example;

import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
  
        double tipCost = Math.round(cost * (0.01 * percent) * 100.0) / 100.0;
        double totalCost = Math.round((tipCost + cost)* 100.0) / 100.0;
        double costPerPerson = Math.round((cost / people)* 100.0) / 100.0;
        double tipPerPerson = Math.round((tipCost / people)* 100.0) / 100.0;
        double totalPerPerson = Math.round(((cost * (0.01 * percent)) + cost) / people * 100.0) / 100.0;
        // I learned how to round from here: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java





        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tipCost + "\n" +
                       "Total Bill with tip: $" + totalCost + "\n" +
                       "Per person cost before tip: $" + costPerPerson + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        // String result = "Extra credit not implemented";
        boolean condition = true;
        
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        double tipCost = Math.round(cost * (0.01 * percent) * 100.0) / 100.0;
        double totalCost = Math.round((tipCost + cost)* 100.0) / 100.0;
        double costPerPerson = Math.round((cost / people)* 100.0) / 100.0;
        double tipPerPerson = Math.round((tipCost / people)* 100.0) / 100.0;
        double totalPerPerson = Math.round(((cost * (0.01 * percent)) + cost) / people * 100.0) / 100.0;
        // I learned how to round from here: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tipCost + "\n" +
                       "Total Bill with tip: $" + totalCost + "\n" +
                       "Per person cost before tip: $" + costPerPerson + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n" + "Items ordered:\n";

              
        Scanner scan = new Scanner(System.in);
        String items = "";
        while (condition == true) {
            //enter your code here 
            System.out.println("Enter an item name or type '-1' to finish: ");
            items = scan.nextLine();
            

            if (items.equals("-1")) {
                condition = false;
                result += "-------------------------------\n";
            } else {
                result += items + "\n";
            }
        }
        
        return result;
         

        

        
    }

    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
