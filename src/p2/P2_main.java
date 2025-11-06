package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 50;
		int b = 50;
		int c = 100;
		int d = 0; 
		
		if ( a == b) {
			d = d + 1;
		}
		if (a == b || a == c) {
			d = d + 1;
		}	
		if ( a + b >= c) {
			d = d + 1; 
		}	
		if ( a + b + c >= 100) {
			d = d + 1; 
		}	
			
		System.out.println("Anzahl erfüllter Eigenschaften: " + d);
		}
	
}
