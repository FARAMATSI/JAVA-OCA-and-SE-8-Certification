import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNums = new int[10];
        for(int i = 0; i<randomNums.length; i++){
            randomNums[i] = random.nextInt(100);
        }
        System.out.println("This is the unsorted Array");
        for(int i = 0; i<randomNums.length; i++){
            System.out.print(randomNums[i] +",");
        }

        System.out.println("Sorted Array \n \n \n");

        class  InsertionSort{
            public InsertionSort(int[] inputArray){
                // 12,4;
                for(int i = 1; i < inputArray.length; i++){
                    int[] newArray = new int[inputArray.length];
                    int currentNum = inputArray[i]; //
                    int previousNum = inputArray[i-1];

                    while(currentNum>= previousNum){

                    }

                    /**
                     * 1st iteration
                     * currentNum = 4;
                     * previousNum = 12;
                     * 2nd iteration
                     * currentNum = 7;
                     * previousNum = 4
                     * 3rd iteration
                     *
                     */

                }
            }

        }

    }
}