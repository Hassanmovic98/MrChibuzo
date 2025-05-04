import java.util.Scanner;
public class Testing{
 	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

	System.out.print ("enter an integer: ");
	int NumberA = input.nextInt();

	boolean outcome = Kata.isEven(NumberA);
	
   	System.out.println (NumberA +  " true or false: " + outcome);


  public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);

	System.out.print ("enter an integer: ");
	int NumberA = input.nextInt();

	boolean outcome = Kata.prime(NumberA);
	
   	System.out.println (NumberA +  " is prime  " + outcome);

 }


	public static void main(String[]args){
	 	
		Scanner input = new Scanner(System.in);

	System.out.print ("enter an integer: ");
	int NumberA = input.nextInt();
	
	System.out.print ("enter another integer: ");
	int NumberB = input.nextInt();
	
	int result = Kata.positiveProduct (NumberA, NumberB );

       System.out.println ("Answer: "+ result);


  }




}





















	





