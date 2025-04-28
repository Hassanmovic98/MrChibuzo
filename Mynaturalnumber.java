import java.util.Scanner;

public class Mynaturalnumber{
public static void main (String[]args){

Scanner input = new Scanner (System.in);


int sum = 0;
int counter = 1;

while (counter<= 10){
System.out.print ("enter a natural number"); 
int number = input.nextInt();
sum = sum + number;
counter = counter =1;
}
System.out.print("The sum of the natural number are; "+ sum);




}


}