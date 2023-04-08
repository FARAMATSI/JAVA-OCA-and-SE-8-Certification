package firstPackage;
import java.util.ArrayList;
import java.util.Random;
import  java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random1 = new Random();
        System.out.println("How Many Array Elements do you want to be printed");
        int maxIndex = scanner.nextInt();
        ArrayList<Integer> numToSort = new ArrayList<Integer>();
        for (int i = 0; i < maxIndex; i++){
            numToSort.add(random1.nextInt(100));
        }
        System.out.println("The unsorted array elements are: \n");
        System.out.println(numToSort);
        System.out.println();
        System.out.println("Sorting the Arraylist:::!!!!!!!! \n");
        insertionSort(numToSort);
    }
    /**
     * Start of a Method body
     * @param inputArray
     */
    public static void insertionSort(ArrayList<Integer> inputArray){
        int b=1;
        while (b<=inputArray.size()-1) {
            // b is responsible for repeating the same process for a stage multiple times depending on array length{
            for(int i = 1; i < inputArray.size(); i++) {
                if (inputArray.get(i) < inputArray.get(i-1)) {
                    int nextInd = inputArray.get(i);
                    int prevInd = inputArray.get(i - 1);
                    inputArray.set(i, prevInd);
                    inputArray.set(i - 1, nextInd);
                }
            }

            b++;
        }
        System.out.println("Sorted array below:\n");
        System.out.println(inputArray);

    }

}




