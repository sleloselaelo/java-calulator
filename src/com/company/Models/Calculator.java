package com.company.Models;

public class Calculator {
    private double num1;
    private double num2;
    private char op;

    //a costructor to initialize the variables
    public Calculator(double num1, double num2, char op) {

        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }


    //method to calculate and display the calculated
    public void calculate() {
        double product;

        switch (op){
            case '+':
                product = num1 + num2;
                break;
            case '-':
                product = num1 - num2;
                break;
            case '*':
                product = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    product = num1 / num2;
                } else {
                    System.out.println("Can not divide number by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Entered operator not recognized");
                return;
        }

        System.out.println("Calculated products: " + product);
    }
}
