import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Student stud1 = new Student();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
       // students.stude.add(new Student());
        //students2.add(new Student());
       // System.out.println(students2.get(0));
        for (int i=0; i<5; i++){
            System.out.println("Enter the mark of the Student");
            students.add(scanner.nextLine());
        }
        System.out.println(students);
       //System.out.println("How many Students do you like to add their Names: ");
        /**
         * int maxNum = scanner.nextInt();
         *        scanner.nextLine();
         *          for(int i = 0; i<=maxNum; i++) {
         *              System.out.println("Enter the Mark for Student " + i);
         *              String name = scanner.nextLine();
         *              students.add(name);
         *              System.out.println("yes, and i is " + i);
         *          }
         *         System.out.println("Displaying the Students Database contents");
         *         for(int i =0; i<students.size(); i++){
         *             System.out.println(students.get(i));
         *         }
         *     }
         */


}
}
