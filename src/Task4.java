import java.util.Scanner;
public class Task4 {
    static int find_element(float key,float[] iterable){
        int pos = 0;
        for(float num:iterable){
            if(num == key)
            {
                break;
            }
            pos+=1;
        }
        return pos;
    }
    static float max_element(float[] iterable){
        float maximum = iterable[0];
        for(int i =0;i<iterable.length;i++){
            if(iterable[i]>=0 && iterable[i]<=100)
            {
                if(maximum<iterable[i]){
                    maximum=iterable[i];
                }
            }

        }
        return maximum;
    }
    static float min_element(float[] iterable){
        float minimum = iterable[0];
        for(int i=0;i<iterable.length;i++){
            if(iterable[i]>=0 && iterable[i]<=100){
                if(minimum>iterable[i]){
                    minimum=iterable[i];
                }
            }

        }
        return minimum;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int invalide_count = 0;
        double total_valid_grades = 0;
        System.out.println("Welcome To Grade Validation Program");

        System.out.print("What is the number of Grades You will Insert?: ");
        int grade_size = scanner.nextInt();
        float[] grades = new float[grade_size];
        int[] grade_check = new int[grade_size];

        for(int i=0;i<grade_size;i++){
            System.out.printf("Enter Grade %d: ",i);
            grades[i] = scanner.nextFloat();
            if (grades[i]<0 || grades[i] >100){
                invalide_count+=1;
                grade_check[i] = 0;
            }else {
                grade_check[i] = 1;
                total_valid_grades+=grades[i];

            }
        }
        System.out.println("------------------------------------------------");
        System.out.print("Parameters | ");
        for(int i=0;i<grade_size;i++){
            System.out.printf("Student (%d) | ",i+1);
        }
        System.out.print("\nGrades     |    ");
        for(var grade:grades){
            System.out.printf("%5s     |    ",grade);
        }
        System.out.print("\nValid      |    ");
        for(var p:grade_check){
            System.out.printf("%5s     |    ",p);
        }
        System.out.println("\n------------------------------------------------");
        double avrg_grade = total_valid_grades/(grade_size-invalide_count);

        System.out.println("\nNumber Of Invalid Grades = "+invalide_count);
        System.out.println("Average Valid Grades = "+avrg_grade);
        System.out.printf("Largest Number = %.2f, Founded in Position %d\n",
                max_element(grades),
                find_element(max_element(grades),grades)
                );
        System.out.printf("Smallest Number = %.2f, Founded in Position %d\n",
                min_element(grades),
                find_element(min_element(grades),grades)
        );
        System.out.println("------------------------------------------------");
        System.out.println("Student That have grades > 85%");
        int student_count = 0;
        for(int i=0;i<grade_size;i++){
            if(grade_check[i]==1 && grades[i] >85){
                System.out.printf("Student %d With a grade = %.2f\n",i+1,grades[i]);
                student_count+=1;
            }
        }
        System.out.println("Number Of Students = "+student_count);
        System.out.println("------------------------------------------------");
        System.out.println("Student That have grades > Average");
        student_count=0;
        for(int i=0;i<grade_size;i++){
            if(grade_check[i]==1 && grades[i] >avrg_grade){
                System.out.printf("Student %d With a grade = %.2f\n",i+1,grades[i]);
                student_count+=1;
            }
        }
        System.out.println("Number Of Students = "+student_count);
    }
}
