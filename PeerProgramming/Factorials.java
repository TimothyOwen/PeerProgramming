package PeerProgramming;

public class Factorials {

	public static int FactorialCalc(int num)
	{		
		 int current = 1;
		 
		    while (num > current) {
		    	 if ((num % current) !=0) {
		             return -1; //not divisible
		         }
		         num /= current;
		         ++current;
		     }
		     if (current == num) {
		         return current;
		     }
		    
		return -1;
	}
}
