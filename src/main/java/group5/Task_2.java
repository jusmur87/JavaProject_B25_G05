package group5;

/*
Create an array of five integer values. After the array is created, use a loop to calculate and
print the average of all the elements.
 */
public class Task_2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum +=numbers[i];

        }
        double average = (double) sum/ numbers.length;

        System.out.println("Average: " + average);
    }
}
