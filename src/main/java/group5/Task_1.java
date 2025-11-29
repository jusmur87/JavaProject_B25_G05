package group5;

/*
Create a program that uses an array to store the names of five fruits, and then uses a loop
to print each fruit name on a new line.
 */


public class Task_1 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);

        }
    }
}