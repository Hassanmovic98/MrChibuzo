import java.util.Scanner;
import java.util.Random;
public class Papergame{
public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	Random rnum = new Random();

	System.out.print ("guess between 0,1 and 2);
	int random = rnum.nextInt();

int Scissors = 0;

int rock = 1;

int paper = 2;

int user = 0;
 
int computer = 0;



if(user = 0){
System.out.print("Scissors);
}
if (user = 1){
System.out.print("rock");
}
if (user =2)
System.out.print("paper");
}


if(computer = 0){
System.out.print("Scissors);
}
if (computer = 1){
System.out.print("rock");
}
if (computer =2)
System.out.print("paper");
}
if(computer = 0){
System.out.print("Scissors);
}


if (user == computer){
System.out.print("draw");
}
if (user == 2 && computer == 1){
System.out.print ("You win");
}
if (user == 1 && computer == 0){
System.out.print ("you win");
}
if (user == 0 && computer == 2){
System.out.print ("you win");
}
if (user== 2 && computer == 1){
System.out.print ("you win");
}



while (number == computer){
System.out.println ("enter between 0-2");
number= input.nextInt();
number = number + 1;
}

if (number == computer){
System.out.println ("low number, try again!");
}


if ( user ==computer){
System.out.println ("low number, try again!");
}



}

}