package com.aplanatraining.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        new Calculator().scan();
    }

    public void scan(){
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean indexScan = true;
        while(indexScan){

            System.out.println("Enter the first number:");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double secondNumber = scanner.nextDouble();
            double result = 0.0;
            boolean index = true;
            while(index) {
                System.out.println("Enter the operation(+, -, *, /)");
                String operation = scanner.next();

                switch (operation) {
                    case "+":
                        result = calculator.sum(firstNumber, secondNumber);
                        index = false;
                        break;
                    case "-":
                        result = calculator.difference(firstNumber, secondNumber);
                        index = false;
                        break;
                    case "*":
                        result = calculator.multiplication(firstNumber, secondNumber);
                        index = false;
                        break;
                    case "/":
                        result = calculator.div(firstNumber, secondNumber);
                        index = false;
                        break;
                    default:
                        index = true;
                        break;
                }
            }

            calculator.printFormat(result);
            System.out.println("Continue? y/n");
            String cont = scanner.next();
            if(cont.equals("y")) {
                indexScan = true;
            }
            else if (cont.equals("n")) {
                indexScan = false;
            }
        }
    }


    public double sum(double a, double b){
        return a + b;
    }

    public double difference(double a, double b){
        return a - b;
    }

    public double multiplication(double a, double b){
        return a * b;
    }

    public double div(double a, double b){
        return a / b;
    }

    public void printFormat(double result){
        System.out.printf("Result is: %.4f", result);
        System.out.println("");
    }
}
