package com.company;

import com.company.Models.Calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
           //for input from user
        Scanner sc = new Scanner(System.in);

        // Getting  input for numbers and operator
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        //creatimng an object
        Calculator calcObj = new Calculator(num1,num2,op);


        //calling method to calculate the entered numbers
        calcObj.calculate();

        }
}
