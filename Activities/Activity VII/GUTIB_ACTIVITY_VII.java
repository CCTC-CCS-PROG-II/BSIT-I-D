import java.util.Scanner;

public class GUTIB_ACTIVITY_VII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();
        long factorial = 1;
        factorial *= 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial");
    }
}
