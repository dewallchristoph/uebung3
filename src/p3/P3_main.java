package p3;

public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = -7;
		if (x < 0) { 
			x = -x;
		} 
		System.out.println("Betrag: " + x);
		
		int y = 5;
		y = y * y;
		System.out.println("Quadrat: " + y);
		
		int z = 11; 
		if (z % 2 == 0) {
		System.out.println(z + " ist ungerade."); 
		} else { 
			System.out.println(z + " ist ungerade."); 
		}
		}
	}

