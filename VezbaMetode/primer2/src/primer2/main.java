package primer2;

import java.util.Scanner;

public class main {
	
	public static void unetiNiz (int broj, double nizic[]) {
	
		System.out.println("Elementi niza su: ");
		for(int i = 0; i < broj; i++) {
			System.out.println(nizic[i]+" ");
		}
	}
	public static double srednjaVrednost(double array [], int duzina) {
		double s = 0;
		for(int i = 0; i<duzina; i++) {
			s += array[i];
		}
		return s/duzina;
	}

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Unesite duzinu niza");
		int n = sc.nextInt();
	
		double niz [] = new double [n];
		
		System.out.println("Unesite elemente niza");
		
		for(int i = 0; i < n; i++) {
			System.out.println("["+i+"] = ");
			niz[i] = sc.nextInt();
	}
		
		main.unetiNiz(n, niz);
		System.out.println("Srednja vrednost niza brojeva: "+main.srednjaVrednost(niz, n));
		
		

	}

}
