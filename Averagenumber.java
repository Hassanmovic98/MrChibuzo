import java.util.Scanner;
public class Averagenumbers {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int postiveCount = 0;
		int negativeCount = 0;
		int totalSum = 0;
		

		System.out.println ("enter 5 numbers");
		number = input.nextInt();

	for (int i = 0; i < 5;i++);
		int number = input.nextInt();
		totalSum += number; 
	
	if (number > 0) {
	   positiveCount++;
	} else if (number < 0) {
		negativeCount ++;
	   }
	
	}
	
	double average = totalSum / 5.0; 

	System.out.println("Number of positive integers" + positiveCount);
	System.out.println("Number of negative integers" + negativeCount);
	System.out.println("Total sum of numbers: " + totalSum);
        System.out.println("Average of numbers: " + average);
    }


	
}