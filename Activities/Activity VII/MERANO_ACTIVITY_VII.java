import java.util.Scanner;
public class MERANO_ACTIVITY_VII{
    public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter a number: ");
       int num = sc.nextInt();

       long factorial = 1;

       for(int i = 1; i <= num; i++){
         factorial *=i;
       }
         System.out.println("The factorial of "+num+" is "+factorial);

    }
} 
    

