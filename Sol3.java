package project_euler;

import java.util.ArrayList;

public class Sol3 {

	public static void main(String[] args) {
		long dividend = 600851475143l;
		
		ArrayList<Long> prime_factors = new ArrayList<>();
		for(long divisor = 2; divisor<=dividend; divisor++) {
			if(dividend%divisor == 0 && dividend>1) {
				prime_factors.add(divisor);
				dividend = dividend/divisor;
				divisor--;
			}
			else if(dividend == 1) {
				break;
			}
		}
		
		System.out.println(prime_factors.get(prime_factors.size()-1));

	}

}
