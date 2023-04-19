package Hanoj;

public class primerRekurzije {
	
	static int brojac = 0;
	
	public static void primer() {
		brojac++;
		if(brojac <= 5)
			System.out.println("broj " + brojac);
		primer();
	}

	public static void main(String[] args) {
		
		primer();

	}

}
