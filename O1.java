
//Oppgave O1

package no.hvl.dat100;

public class O1 {

	public static void main(String[] args) {
		System.out.print("Trinnskatt som må betales: ");
		
		int inntekt = 1969200;
		
		//Trinn 0
		if(inntekt<190349){System.out.print(0);}
		
		//Trinn 1
			else if(inntekt<267900){System.out.print(inntekt*1.7/100);}
		
		//Trinn 2
			else if(inntekt<643800){System.out.print(inntekt*4.0/100);}
		
		//Trinn 3
			else if(inntekt<969200){System.out.print(inntekt*13.4/100);}
		
		//Trinn 4
			else if(inntekt<2000000){System.out.print(inntekt*16.4/100);}
		
		//Trinn 5
			else{System.out.print(inntekt*17.4/100);}
		
		System.out.print("Kr");
}
}