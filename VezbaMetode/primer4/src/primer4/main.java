package primer4;

public class main {
	
	public static int zbir(int x, int y) {
		return x+y;
	}
	public static double zbir(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		int a = 2, b = 2;
		double c = 2.2, d = 3.3;
		
		System.out.println(main.zbir(c, d));
		System.out.println(main.zbir(a, b));

	}

}
