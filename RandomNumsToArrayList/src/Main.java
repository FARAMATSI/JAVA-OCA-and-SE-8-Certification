import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many elements do you want boss");
        int maxIndex =scanner.nextInt();
        ArrayList<Integer> numsToSort = new ArrayList<Integer>();
        for(int i =0; i<maxIndex; i++){
            numsToSort.add(random.nextInt(100));
        }
        System.out.println(numsToSort);
    }
}
