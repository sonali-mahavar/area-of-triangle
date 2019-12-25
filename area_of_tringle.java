
package java2;
import java.util.Scanner;

public class Java2 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of the rectangle:");
        double b=sc.nextDouble();
        System.out.print("Enter the height of the rectangle:");
        double h=sc.nextDouble();
        double area=(b*h)/2;
        System.out.print("Area of the triangle is:"+area);
     
    }
    
}
