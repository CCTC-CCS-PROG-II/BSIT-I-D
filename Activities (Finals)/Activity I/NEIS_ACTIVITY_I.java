import java.util.Scanner;

public class NEIS_ACTIVITY_I{
   public static void main(String[] args){
    int length = getLength();
    int width = get width();
    int area = length * width;
    System.out.printIn("Area = " + area);
   }

   static int getLength(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle: ");
    return sc.nextInt();
   }

   static int getwidth(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the width of the rectangle: ");
    return sc.nextInt();
   }
}
