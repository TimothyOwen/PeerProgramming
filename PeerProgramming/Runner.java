package PeerProgramming;

public class Runner {

	public static void main(String args[])
	{
		//Factorials
		Factorials f = new Factorials();
		System.out.println(f.FactorialCalc(18));
		 
		 
		//Doggo
		Doggo doggo = new Doggo();
		doggo.displayPlace(99);
		
		
		//Calculator
		Calculator calculator = new Calculator(5,3,15);
		System.out.println("----------");
		Calculator calculator1 = new Calculator(4,2,8);
		System.out.println("----------");
		Calculator calculator2 = new Calculator(6,2,12);
		System.out.println("----------");
		Calculator calculator3 = new Calculator(6,2,3);
		System.out.println("----------");
		Calculator calculator4 = new Calculator(9,12,108);
		System.out.println("----------");
		Calculator calculator5 = new Calculator(4,16,64);
		
	}
}
