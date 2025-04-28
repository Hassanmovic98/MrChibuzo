import java.util.Scanner;
public class Exchangerate{
public static void main (String[] args){

	Scanner input = new Scanner(System.in);
System.out.print ("Enter the exchange rate from dollars to Rmb: ");
double input1= input.nextDouble();

System.out.print ("Enter 0 to convert dollars to Rmb and 1 vice versa: ");
double input2= input.nextDouble();

System.out.print ("Enter the dollar amount");
double input3 = input.nextDouble();


if(input2 == 0){
System.out.print("Enter dollar number");
double  dollarNumber= input.nextDouble();
double convert = dollarNumber * input1;
System.out.printf ("$%.2f is %.2fyuan", dollarNumber , convert);
} 

if (input2== 1){
System.out.print("Enter yuan number");
double yuanNumber= input.nextDouble();
double convert = yuanNumber * input1;
System.out.printf ("yuan%.2f is %.2f$", yuanNumber , convert);
}
if(input2 =< 0){
System.out.print ("Enter dollar number");
double dollarNumber= input.nextDouble();
double covert = yuuanNumber * input1;
System.out.printf ("number is invalid ", dollarNumber, covert);
}









}

}