package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner (System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first number: ");
        String num1String = getInput.nextLine();
        double num1 = Double.parseDouble(num1String);

        System.out.print("Enter operator (+,-,*,/,%): ");
        String op = getInput.nextLine();

        System.out.print("Enter second number: ");
        String num2String = getInput.nextLine();
        double num2 = Double.parseDouble(num2String);

        switch (op){
            case "+":
                calculator.add(num2,num2);
                break;
            case "-":

                break;
            case "*":

                break;
            case "/":

                break;
            case "%":

                break;
        }


    }

}