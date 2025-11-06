package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int jahr = 2006; 
	boolean schalt = false; 
	
	if (jahr % 400 == 0) {
		schalt = true; 
	} else if (jahr % 100 == 0) {
		schalt = false; 
	} else if (jahr % 4 == 0) { 
		schalt = true; 
	} else {
		schalt = false; 
	}
	
	System.out.println("Ist das Jahr " + jahr + " ein Schaltjahr? " + schalt); 
	}
	

}
