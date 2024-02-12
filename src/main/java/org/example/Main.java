package org.example;

public class Main {
    public static void main(String[] args) {
        float avgNum = avgNumber(10.1f, 7.2f, 9.0f);
        System.out.println("Task1: Average value = " + avgNum);

        float salary = annualSalary (1000.50f);
        System.out.println("Task2: Annual salary = " + salary);

        Payments (1000, 6);

    }

    public static float avgNumber(float number1, float number2, float number3) {
        return (number1 + number2 + number3) / 3;
    }

    public static float annualSalary (float salary) {
        return salary * 12;
    }

    public static void Payments (float sum, int months){
        double interestSum = sum * (0.07 / 12) * months;
        double returnSum = sum + interestSum;
        double monthlyPayment = returnSum / months;
        System.out.println("Task3: Initial sum " + sum + " for " + months + " months with 7% annual interest.");
        System.out.println("Client returns sum = " + returnSum);
        System.out.println("Monthly payment = " + monthlyPayment);
                    }

}