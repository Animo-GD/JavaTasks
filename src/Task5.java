import java.util.Scanner;
import java.lang.Math;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Finding The Root Of Equation (aX^2 + bX + c = 0) ");
        System.out.print("Enter (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter (b): ");
        double b = scanner.nextDouble();
        System.out.print("Enter (c): ");
        double c = scanner.nextDouble();
        if((a==b)&&(b==c)&&(c==0))
        {
            System.out.println("Solution: Any Real Value For X1 and X2");
        } else if ((a==b)&&(c!=0)) {
            System.out.println("There Is No Solution");
        }else if(a==0){
            double root = -c/b;
            System.out.println("There is only one root = "+root);
        }
        else{
            double discriminant = (b*b)-(4*a*c);
            if (discriminant >=0){
                double x1 = (-b+Math.sqrt(discriminant))/(2*a);
                double x2 = (-b-Math.sqrt(discriminant))/(2*a);
                System.out.printf("Solution:\nX1 = %.2f, X2 = %.2f",x1,x2);
            }else {
                System.out.println("There Is two real or complex roots");
            }

        }
        scanner.close();
    }
}
