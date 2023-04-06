import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        ArrayList<String> students2 = new ArrayList<>(Arrays.asList("John","Betty","Mwape","Anesu","Brian"));
       System.out.println("How many Students do you like to add their Names: ");
       int maxNum = scanner.nextInt();
       scanner.nextLine();
         for(int i = 0; i<=maxNum; i++) {
             System.out.println("Enter the Mark for Student " + i);
             String name = scanner.nextLine();
             students.add(name);
             System.out.println("yes, and i is " + i);
         }
        System.out.println("Displaying the Students Database contents");
        for(int i =0; i<students.size(); i++){
            System.out.println(students.get(i));
        }
    }

}
