package metode;

import java.io.*;

public class primer13 {
	public static boolean uslov(int a, int b, int c, int d) {
		return ((a < c) && (b < d)) || ((a < d) && (b < c));
	}

	public static void main(String[] args) throws Exception { 
		int a, b, n;
		int c[] = new int[100];
		int d[] = new int[100];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
		// Unos podataka
			 System.out.print("Unesite stranicu a: "); 
			 a = Integer.parseInt(ulaz.readLine());
			 System.out.print("Unesitestranicu b: "); 
			 b = Integer.parseInt(ulaz.readLine());
			 System.out.print("Koliko novih pravougaonika zelite da unesete?"); 
			 n = Integer.parseInt(ulaz.readLine());
			 
			 System.out.print("Unesite stranice c i d: \n"); 
			 for (int i = 1; i <= n; i++) {
				 System.out.print("c[" + i + "] = "); 
				 	c[i] =Integer.parseInt(ulaz.readLine());
				System.out.print("d[" + i + "] = ");
					d[i] = Integer.parseInt(ulaz.readLine());
		 }
		 for (int i = 1; i <= n; i++) {
			 if (uslov(a, b, c[i], d[i]))
			 System.out.println("Pravougaonik sa stranicama c = " + c[i] + " i d = " + d[i] + " nalazi se u pravougaoniku stranica a = " + a + " i b = " + b);
			 else
			 System.out.println("Pravougaonik sa stranicama c = " + c[i] + " i d = " + d[i] + " ne nalazi se upravougaoniku stranica a = " + a + " i b = " + b);
			 } 
		 }
	}

}
