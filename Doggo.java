package peer_programming;

public class Doggo {
	public void displayPlace(int p) {
		for(int i=1; i<101; i++) {
			if(i==p) {
				System.out.println("X");
			}
			else if(i==1) {
				System.out.println(i+"st");
			}
			else if(i==2) {
				System.out.println(i+"nd");
			}
			else if(i==3) {
				System.out.println(i+"rd");
			}
			else if(i>20) {
				String s = Integer.toString(i);
				if(s.substring(1,2).equals("1")) {
					System.out.println(i+"st");
				}
				else if(s.substring(1,2).equals("2")) {
					System.out.println(i+"nd");
				}
				else if(s.substring(1,2).equals("3")) {
					System.out.println(i+"rd");
				}
				else {
					System.out.println(i+"th");
				}
			}
			else {
				System.out.println(i+"th");
			}
		}
	}
}
