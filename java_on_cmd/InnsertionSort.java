import java.util.Random;
class InsertionSort{
	public static void main(String[] args){
	Random random = new Random();
	int[] randomNums = new int[10];
	for(int i = 0; i<randomNums.length; i++){
	randomNums[i] = random.nextInt(100);
}
	System.out.println("This is the unsorted Array");
		for(int i = 0; i<randomNums.length; i++){
		System.out.print(randomNums[i] +",");
}
}
}