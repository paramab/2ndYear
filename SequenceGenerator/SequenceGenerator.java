/**
 * This code will create a sequence
 * based on the user's input
 * 
 * @Barane Paramanathan
 * @Version 2.8
 * 
 * @see
 * @since
 * @deprecated 
 */
 
import java.util.Scanner; 

public class SequenceGenerator {
	
  /** 
  * This method will check if the user
  * has inputed a number within the range
  */
     	
  public static boolean rangeCheck (int num) {
  	if (0<=num && num <=100){
  		return (true);
  	} else {
  		return (false);
  	}
  	
  }

  public static void main (String [] args) {	
  Scanner input = new Scanner(System.in);
  	
  int count = 1; 
    			
  System.out.println("Welcome to the Sequence Generator!");
  System.out.println("---------------------------------");
  
  //Recieves input from user		
  System.out.print("Please Enter a Positive interger no more than 100: ");
  int num = input.nextInt();
  
  //Checks range is correct
  if (rangeCheck(num)) {
  	
  	while (num>1){
  		
  	//If number is an even number, output should be with [] brackets		
	if (num%2==0){
 	  System.out.print("["+num+"] ");
 	  num = num/2;
 	  	//Line can only contain 20 numbers
 	    if (count==20) {
 	      System.out.println("");
 	    }
 	     				
    } else {
    	
      //If number is an even number, output should be with [] brackets		
      System.out.print("("+num+") "); 
      num = 6* num + 2;	
      	if (count==20) {
 	      System.out.println("");
 	    }
    }
    			
	count +=1;			
    }
    
  } else {
  	System.out.println("Your number is not valid");
  	
  } 		
  
  
  }
     		
}
    
    
