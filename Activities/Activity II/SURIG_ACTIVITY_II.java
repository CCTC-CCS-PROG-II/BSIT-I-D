import java.util.Scanner;
public class SURIG_ACTIVITY_II{
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("1st Input Value: ");
    int firstNumber = sc.nextInt();
    System.out.println("2nd Input Value: ");
    int secondNumber = sc.nextInt();

    int sum = firstNumber + secondNumber;
    int diff = firstNumber - secondNumber;
    int product = firstNumber * secondNumber;

    System.out.println("Sum =" + sum);
    System.out.println("Difference =" + diff);
    System.out.println("Product =" + product);

    sc.close();

  }
}