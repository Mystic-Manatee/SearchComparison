import java.util.concurrent.ThreadLocalRandom;
public class Search {
	public static void main(String[] args) {
		int randomNumber;
		int[] arrayNormal = new int[1000000]; //array to store numbers as they are generated
		{
			for(int i=0; i<=999999; i++){
				arrayNormal[i] += ThreadLocalRandom.current().nextInt(0, 1000001);
			}
		System.out.print("Array generation complete");
		printout(arrayNormal);
		}
	}
	public static void printout(int[] input) {
		for (int i = 0; i<input.length; i++) {
			System.out.println(input[i]);
		}
		System.out.println("there are " + input.length + " numbers in the array");
	}
}

/*

int[] arraySorted = new int[1000000]; //array to store the numbers in ascending order
*/