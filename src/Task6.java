import java.util.Scanner;

public class Task6 {

    static int count_element(double key,double[] iterable){
        int count = 0;
        for(double element:iterable){
            if(key==element){
                count+=1;
            }
        }
        return count;
    }
    static void print_array(double[] arr){
        for(var element:arr){
            System.out.print(element+" ");
        }
    }
    static void print_array(int[] arr){
        for(var element:arr){
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        //Input [1 8 7 5] and [5 3 1 7 6 7 7] will produce output [1 0 3 1]
        Scanner scanner = new Scanner(System.in);
        System.out.println("Finding the number of element occurrence From Array 1 In Array2");
        System.out.print("Enter Array1 Size: ");
        int size1 = scanner.nextInt();
        System.out.print("Enter Array2 Size: ");
        int size2 = scanner.nextInt();

        double[] arr1 = new double[size1];
        double[] arr2 = new double[size2];
        int[] positions = new int[size1];
        System.out.println("----------------------------------------");
        //Getting Array 1 from the user
        System.out.printf("Insert %d Elements For Array1\n",size1);
        for(int i = 0;i<size1;i++){
            arr1[i] = scanner.nextDouble();
        }
        System.out.println("----------------------------------------");
        //Getting Array 2 from the user
        System.out.printf("Insert %d Elements For Array2\n",size2);
        for(int i = 0;i<size2;i++){
            arr2[i] = scanner.nextDouble();
        }

        //Count the Number Of Occurrence
        for(int i = 0;i<size1;i++){
            positions[i] = count_element(arr1[i],arr2);
        }

        //Print The final Arrays
        System.out.println("----------------------------------------");
        System.out.print("Array1: ");
        print_array(arr1);
        System.out.print(",    Array2: ");
        print_array(arr2);
        System.out.print("\nResult Array: ");
        print_array(positions);

    }
}
