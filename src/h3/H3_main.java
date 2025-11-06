package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 5; 
		int fix = 3; 
		int wartend = 33; 
		boolean istVoll = false; 
		
		int freiePlaetze = max - fix; 
		
		if (freiePlaetze <=0) {
			istVoll = true; 
		} else if (wartend == 0) {
			istVoll = false; 
		} else { 
			if (wartend >= freiePlaetze) { 
				fix = fix + freiePlaetze;  
				wartend = wartend - freiePlaetze; 
				istVoll = true; 
			} else {
				fix = fix + wartend; 
				wartend = 0; 
				istVoll = false; 
			}	
		}	
				
	System.out.println("fix = " + fix); 
	System.out.println("wartend = " + wartend); 
	System.out.println("istVoll = " + istVoll);
	}
}
