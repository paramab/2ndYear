public class main {

	

	public static void main(String[] args) {
		double terms1[] = {2, 0, 1};
		
		
		Polynomial a = new Polynomial(terms1);
		
		double evalResult = a.evaluate(1);
		
		double inte   = a.integration(0, 1); 
		
		System.out.println(a.print());
		System.out.println(evalResult);
		System.out.println();

		
	}

}
