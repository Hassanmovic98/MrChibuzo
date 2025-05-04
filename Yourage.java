import java.util.Scanner;

public class Yourage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("kindly eter your age : ");
        double  age = input.nextDouble(); 
	

       
        double months = age * 12;                         
        double days = age * 365;                     
        double hours = days * 24;                         
        double minutes = hours * 60;                      
        double seconds = minutes * 60;                    

        
        

        System.out.println("age: " + age);
       	
	System.out.println("months: " + (age * 12) + " months");


        System.out.printf("days: %.0f (age * 365)%n", days);

        System.out.printf("hours: %.0f (days * 24)%n", hours);

        System.out.printf("minutes: %.0f (hours * 60)%n", minutes);

        System.out.printf("seconds: %.0f (minutes * 60)%n", seconds);

        
    }

}










