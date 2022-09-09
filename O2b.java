//b & c
 
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2b {

	public static void main(String[] args) {
		
	      int numberRead = 0;
	        while(true) {
	            if(numberRead == 10) {break;}
	            String karakter = showInputDialog("Hvor mye poeng fikk eleven? ");
	            
		int poeng = parseInt(karakter);
		
		//int poeng = -10;
		
		{System.out.print("Karakter: ");}
		
		// Under 0
		if(poeng<0){System.out.print("Ugyldig Ressultat. Skriv inn på nytt.");numberRead = numberRead-1;}
		
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
			else{System.out.print("Ugyldig Ressultat");numberRead = numberRead-1;}
		numberRead = numberRead+1;}
}}