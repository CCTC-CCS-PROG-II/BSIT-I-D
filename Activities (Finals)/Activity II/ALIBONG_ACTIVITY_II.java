import java.util.Scanner;
public class ALIBONG_ACTIVITY_II{
  
    static int getfeet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feet: ");
        int feet = getfeet();
        int inches = feet * 12;
        System.out.printIn(inches);
    }

    public static void main(String[] args){
        getfeet();
    }
}
