package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double guthaben = -100; 
		double monEingang = 200; 
		int rating = -2; 
		boolean warnhinweis = false; 
		boolean negativ = false; 
		
		if (guthaben < 0) { 
			negativ = true; 
		} else {  
			negativ = false; 
		}
		if (guthaben > 0) { 
			rating = rating + 3;
		} else if (guthaben == 0) {
			rating = rating + 2; 
		} else { //guthaben < 0 
			if (Math.abs(monEingang) >= Math.abs(guthaben)) {
				rating = rating + 1;
			} else {
				rating = rating -1; 
			}
		if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0) {
			warnhinweis = true; 
		} else { 
			warnhinweis = false; 
		} 
		
		System.out.println("Negativ = " + negativ);
		System.out.println("Rating = " + rating); 
		System.out.println ("Warnhinweis = " + warnhinweis);
				
		
			}
				
		}
		
		}



