
	

public class Polynomial {

	public double coefficients[];
	public int degree;

	public Polynomial(double terms[]) {
		this.coefficients = terms;
		this.degree = this.coefficients.length - 1;
	}
	
	
	public double evaluate(double x) {

		double Answer = this.coefficients[this.coefficients.length - 1];
		for (int i = 1; i < this.coefficients.length; i++) {
			Answer = Answer * x + this.coefficients[this.coefficients.length - 1 - i];
		}
		return Answer;
	}


	public String print(){
	    if (degree ==  0) return "" + coefficients[0];
	    if (degree ==  1) return coefficients[1] + "x + " + coefficients[0];
	    String s = coefficients[degree] + "x^" + degree;
	    for (int i = degree-1; i >= 0; i--) {
	        if      (coefficients[i] == 0) continue;
	        	else if (coefficients[i]  > 0) s = s + " + " + ( coefficients[i]);
	        	else if (coefficients[i]  < 0) s = s + " - " + (-coefficients[i]);
	        if      (i == 1) s = s + "x";
	        	else if (i >  1) s = s + "x^" + i;
    	}
    	return s;
	}
    
    
    
     public double integration(double a , double b) {
    
     Polynomial integral= new Polynomial ();
          
     integral.degree= degree+1;
	     for (int i=0 ; i<= degree+1 ; i++){
	         if (i==0) {
	             integral.coefficients[i]= 0;
	         }
	         else {
	         integral.coefficients[i]= (coefficients[i-1]/i); 
	         }
	     }
               
         return (integral.evaluate(b)- integral.evaluate(a));
 	}
	
	
}