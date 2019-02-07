package project_euler;

import java.util.ArrayList;

public class Sol10C {
// (FASTEST)
	public static void main(String[] args) {
		int i;
	    long sum = 0;
	      
	    for (i = 2; i < 2000000; i++) {
	      
		    if (isaprime(i) == 1) {
		    	sum = sum + i;
		    }
	    }
	    System.out.println("sum: "+ sum);
	      
	}
	
	static int isaprime (int num) {
	    
	          int i;
	      
	          for (i = 2; i <= Math.sqrt(num); i++) {
	                  if (num % i == 0) {
	                          return 0;
	                  }
	          }
	      
	          return 1;
	      }

}
