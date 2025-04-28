import java.util.Scanner;
public class ValidScorce {
	public static void main (String[] args){
	 Scanner input = new Scanner(System.in);
	int studentGrade = 0;
 	int counter = 1; 
	int wrongCounter = 0;
	int counterA = 0;
	int counterB = 0;
	int counterC = 0;
	int counterD = 0;
	int counterF = 0;
		
	while(counter <= 10){
		System.out.println("you can only enter between 100 -0: ");
		studentGrade = input.nextInt(); 

		if(studentGrade < 0 || studentGrade > 100){
		System.out.print("error");
		wrongCounter = wrongCounter + 1;
		}

		if (studentGrade >= 0 && studentGrade <= 100){
		 

			switch ( studentGrade /10){
		
			case 0, 1, 2, 3, 4: System.out.println ("F, failure just drop out abeggi");
			counterF = counterF + 1; 
			break;

			case 5: System.out.println ("D, olodo!");
			counterF = counterD + 1;
			break;

			case 6: System.out.println ("C, average student leleyi naw");
			counterF = counterC + 1; 
			break;

			case 7: System.out.println ("B, good student");
			counterF = counterB + 1;
			break;

			case 8,9,10: System.out.println ("A, Genius lomo");
			counterF = counterA + 1; 
			break;
	
			}

		}
	}
	System.out.println (" the total pnumber of students with garde A" + counterA);
	System.out.println (" the total pnumber of students with garde B" + counterB);
	System.out.println (" the total pnumber of students with garde C" + counterC);
	System.out.println (" the total pnumber of students with garde D" + counterD);
	System.out.println (" the total pnumber of students with garde F" + counterF);


  }


}