package project_euler;

import java.util.ArrayList;

public class Sol10A {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		long sum = 0;
		int j;
		boolean bool = false;
		for(int i = 3; i<=2000000; i++) {
			for(int t = 1; t*i<i; t++) {
				if((6*t+1 == i)||(6*t-1 == i)) {
					sum+=i;
					bool = true;
					break;
				}
			}
			if(bool) {
				continue;
			}
			bool = false;
			label2: for(j = 0; j<list.size(); j++) {
				for(int k = 1; list.get(j)*k<=i; k++) {
					if(list.get(j)*k == i) {
						break label2;
					}
				}
			}
			if(j==list.size()) {
				System.out.println(i);
				list.add(i);
				sum+=i;
			}
		}
		System.out.println(sum-2);
	}

}
