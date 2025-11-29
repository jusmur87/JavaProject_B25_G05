package group5;


/*
Write a program that declares two integer variables with values, and then swaps them using
a temporary variable. Print the values before and after the swap
 */
public class Task_5 {

    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 45;

        System.out.println("Before swapping the number");
        System.out.println("First number = " + num1);
        System.out.println("Second Numner= "+num2);

        int temporarynum = num1;
        num1 = num2;
        num2 = temporarynum;

        System.out.println("after swapping");
        System.out.println("First Number "+ num1);
        System.out.println("Second Number "+ num2);

    }

}
