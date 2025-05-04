

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
 }

	public static int computeSumOfNumber(int number) {
	int num1 = (number / 1000) % 10;
	int num2 = (number / 100) % 10;
	int num3 = (number / 10) % 10;
	int num4 = (number / 1) % 10;

	int total = num1 + num2 + num3 + num4;
	return total;
}public static int findMultiple(int number) {
	int result = number * 5;
	return result;
}
               

        
        

       






