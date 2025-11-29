package group5;

/*
Create an array to store the scores of six students in a class. Use a loop to count and print
how many scores are above 80.
 */
public class Task_3 {
    public static void main(String[] args) {

        int[] scores = {75, 80, 91, 83, 71, 95};

        int countAbove80 = 0;

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > 80) {
              countAbove80++;
            }

        }
        System.out.println("Number of scores above 80: " + countAbove80);
    }

}
