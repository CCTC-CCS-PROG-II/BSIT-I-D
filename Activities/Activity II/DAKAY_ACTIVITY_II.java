import java.util.Scanner;
public class DAKAY_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first integer: ");
        int num1 = sc.nextInt();
        System.out.println("input second integer: ");
        int num2 = sc.nextInt();
        int ans1 = num1+num2;
        int ans2 = num1-num2;
        int ans3 = num1*num2;
        System.out.println("Sum = "+ans1);
        System.out.println("Difference = "+ans2);
        System.out.println("Product = "+ans3);
    }
}
