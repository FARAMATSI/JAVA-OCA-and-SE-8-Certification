package firstPackage;
import java.util.Random;
import  java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random1 = new Random();
        System.out.println("How Many Array Elements do you want to be printed");
        int maxIndex = scanner.nextInt();
        int[] numToSort =new int[maxIndex];
        for (int i = 0; i < maxIndex; i++){
            numToSort[i] = random1.nextInt(100);
        }
        System.out.println("The unsorted array elements are: \n");
        for (int i = 0; i< numToSort.length; i++){
            System.out.print(numToSort[i]+"\t");
        }
        System.out.println();
        System.out.println("Sorting the Array:::!!!!!!!! \n");
        insertionSort(numToSort);
    }
    /**
     * Start of a Method body
     * @param inputArray
     */
    public static void insertionSort(int[] inputArray){
            int b=1;
        while (b<=inputArray.length-1) {
            // b is responsible for repeating the same process for a stage multiple times depending on array length{ // 5 1
            //System.out.println("Main Loop Started and array Length is "+inputArray.length);
            for(int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] < inputArray[i - 1]) {
                    int nextInd = inputArray[i];
                    int prevInd = inputArray[i - 1];
                    inputArray[i] = prevInd;
                    inputArray[i - 1] = nextInd;
                }
            }
            b++;
        }
        for (int x = 0; x < inputArray.length; x++) {
            System.out.print("\t" + inputArray[x]);
        }

            }

        }




