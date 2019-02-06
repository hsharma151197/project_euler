package project_euler;

public class Sol10 {

	public static void main(String[] args) {
		long sum = 0;
		int j;
		for(int i = 2; i<=10; i++) {
			label2: for(j = 2; j<i; j++) {
				for(int k = 1; j*k<=i; k++) {
					if(j*k == i) {
						break label2;
					}
				}
			}
			if(j==i) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
