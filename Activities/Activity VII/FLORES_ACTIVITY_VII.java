import java.util.Scanner;
public class FLORES_ACTIVITY_VII {
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Factorial Number: ");
        long number = sc.nextInt();
        long fact = 1;
        for(long x=1; x<= number;x++){
            fact*=x;
        }
        System.out.print(fact);
        sc.close();
        
    }
}