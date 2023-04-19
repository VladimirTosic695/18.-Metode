package primer6;

import java.text.DecimalFormat;

public class main {
	
	static double f(double x) {
		return 2 * x - Math.log(x);
	}
	static double g(double x) {
		return Math.tan(x/2.0) + Math.abs(x);
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		double y;
		
		System.out.println("X\tY");
		for(double x = 0.1; x <=0.9; x +=0.1) {
			y = main.f(2 * main.g(main.f(x)));
			
			System.out.println(df.format(x) + "\t"+df.format(y));
		}
		
	}

}
