package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

    public static void main(String[] args) {
        String heltall = "skriv heltall: ";
        int n = parseInt(showInputDialog(heltall));
        int x = n;
        int y=1;
        	while(n>1) {
            y*=n;
            n--;
        }
        showMessageDialog(null, x+"! "+"er: "+y);
    }
}
