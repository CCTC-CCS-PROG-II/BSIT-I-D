import java.util.Scanner;

public class ALIBONG_Activity_III {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] score = new int [5][5];

        System.out.println("Enter the scores: ");

        for (int x = 0; x < score.length; x++) {
            for (int y = 0; y < score.length; y++) {
                System.out.print("Enter score for row" + (x + 1) + ", column" + (y + 1) + ":" );
                score[x][y] = sc.nextInt();

            }
        } 

        int sum = 0;
        int count = 0;
        for (int x = 0; x < score.length; x++){
            for (int y = 0; y <score.length; y++) {
                sum += score [x][y];
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println ("The Average of the Scores: " + average);
    }
}
