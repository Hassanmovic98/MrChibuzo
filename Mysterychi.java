import java.util.Scanner;

import java.util.Random;

	public class Mysterychi{
	 public static void main (String[]args){
		Scanner input = new Scanner (System.in);
			Random rnumber = new Random();
System.out.print ("enter number between 0 to 10");
int number1 = input.nextInt();

System.out.print ("enter number between 0 to 10");
int number2 = input.nextInt();

System.out.print ("enter number between 0 to 10");
int number3 = input.nextInt();

System.out.print ("enter number between 0 to 10");
int number4 = input.nextInt();

System.out.print ("enter number between 0 to 10");
int number5  = input.nextInt();



	
int mysterynumber =10;
int number = 0;


while (number == mysterynumber){
System.out.println ("enter number between 0 and 10");
number= input.nextInt();
number = number + 1;
}

if (number != mysterynumber){
System.out.println ("low number, try again!");
}




}


}








