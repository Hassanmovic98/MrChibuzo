public class Kata{
      public static boolean Even(int number) {
        return number % 2 == 0;
    }


 	public static boolean prime(int number) {
		if (number <=1){ return false ;
		}

	for (int i =2; i * i <= number; i++){
		if (number % i == 0){ return false;
		}


		}return true;
	}
     
    public static int positiveProduct(int man, int woman) {
        if(man > woman) { return man - woman;
	}else{ return woman - man;}
       
 }



}

