package project_euler;

import java.util.ArrayList;

public class Sol10B {
// Sieve Of Eratosthenes
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 3; i<=2000000; i+=2) {
			list.add(i);
		}
		
		System.out.println(list.size());
		
		for(int i = 0; i<list.size(); i++) {
			for(int j = i+1; j<list.size(); j++) {
				if(list.get(j)%list.get(i) == 0) {
					list.remove(j);
				}
			}
		}
		
		System.out.println(list.size());
		
		long sum = 2;
		
		for(long t: list) {
			sum+=t;
		}
		
		System.out.println(sum);

	}

}
