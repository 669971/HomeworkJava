//a

package no.hvl.dat100;

public class O2 {

	public static void main(String[] args) {

		
		int poeng = -10;
		
		{System.out.print("Karakter: ");}
		
		// Under 0
		if(poeng<0){System.out.print("Ugyldig Ressultat");}
		
		// Resultat 0-40
			else if(poeng<40){System.out.print("F");}
		
		// Resultat 40-50
			else if(poeng<50){System.out.print("E");}
		
		// Resultat 50-60
			else if(poeng<60){System.out.print("D");}
		
		// Resultat 60-80
			else if(poeng<80){System.out.print("C");}
		
		// Resultat 80-100
			else if(poeng<90){System.out.print("B");}
				
		// Resultat 80-100
			else if(poeng<=100){System.out.print("A");}
		
		// Over 100
			else{System.out.print("Ugyldig Ressultat");}
	}
}