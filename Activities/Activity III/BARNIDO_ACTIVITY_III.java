import java.util.Scanner;
public class BARNIDO_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Temperature (celsius): ");
        int temp= sc.nextInt();

        if(temp >= 100){
            System.out.println("Boiling");
        }
        else{
            System.out.println("Not Boiling");
        }
    }
}
