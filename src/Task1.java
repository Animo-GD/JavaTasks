import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        //Write program that asks the user for three one-digit numbers and then uses them as
        //units, tens, and hundreds to evaluate one 3-digit number out of them
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Three Digit");
        System.out.print("Enter Units: ");
        int u = scanner.nextInt();
        System.out.print("Enter Tens: ");
        int t = scanner.nextInt();
        System.out.print("Enter Hundreds: ");
        int h = scanner.nextInt();
        System.out.printf("%d%d%d",h,t,u);
    }
}
