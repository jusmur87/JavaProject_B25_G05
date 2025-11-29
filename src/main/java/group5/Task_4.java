package group5;


import java.util.Scanner;

/*
 Write a program that takes two numbers as input and prints their sum, difference, product,
and division without using any extra variables for calculations.
 */
public class Task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scanner.nextInt();

        System.out.println("Please enter another another number");
        int num2 = scanner.nextInt();

        System.out.println("Addition: "+ (num1+num2));
        System.out.println("Difference: "+ (num1 - num2));
        System.out.println("Product: "+ (num1 * num2));

        if (num2 !=0){
            System.out.println("Division: "+((int) num1 / num2));

        }else{
            System.out.println("Division: unable to divide by 0");
        }
        scanner.close();

    }

}
