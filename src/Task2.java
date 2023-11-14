import java.util.Scanner;

public class Task2 {
    static int pow(int base, int power){
        int result = base;
        for(int i=1;i<power;i++){
            result*=base;
        }
        return result;
    }
    public static void main(String[] args) {
        /*
        Write a program that gets two positive integer numbers X and Y
        and calculates X^Y. (Hint:
        using loops with multiplication, i.e., X^Y = X*X*X*… Y times)
        */
        Scanner scanner = new Scanner(System.in);
        int x,y,result;
        System.out.println("Calculating X ^ Y");
        System.out.print("Enter X: ");
        x = scanner.nextInt();
        result = x;
        System.out.print("Enter Y: ");
        y = scanner.nextInt();
        System.out.printf("%d ^ %d = %d",x,y,pow(x,y));
    }
}
