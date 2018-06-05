import java.util.concurrent.ThreadLocalRandom;
public class Search {
	public static void main(String[] args) {{
		int[] arrayNormal = new int[1000000]; //array to store numbers as they are generated
		int[] arraySorted = new int[1000000]; //array to store the numbers in ascending order
		generateArray(arrayNormal);
		sortArray(arraySorted, arrayNormal);
		//printout(arrayNormal);
		printout(arraySorted);
		}
	}
	
	public static int[] generateArray(int[] input) {
		for(int i=0; i<=999999; i++){
			input[i] += ThreadLocalRandom.current().nextInt(0, 1000001);
		}
		return input;
	}
	
	public static int[] sortArray(int[] sortedArray, int[] normalArray) {
		int temp;
		for (int i = 0; i < normalArray.length; i++) {
			if (i == 0 || sortedArray[i-1] <= normalArray[i]){
				sortedArray[i] += normalArray[i];
			}
			else {
				temp = sortedArray[i-1];
				sortedArray[i-1] = normalArray[i];
				sortedArray[i] += temp;
				temp = 0;
			}
		}
		return sortedArray;
	}
	
	public static void printout(int[] input) {
		for (int i = 0; i<input.length; i++) {
			System.out.println(input[i]);
		}
		System.out.println("there are " + input.length + " numbers in the array");
	}
}
