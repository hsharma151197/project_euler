package project_euler;

public class Sol12 {

	public static void main(String[] args) {
		long i;
		int count = 0;
		long sum = 0;
		for(i = 25010; count<500; i+=2) {
			count = 0;
			sum = (i*(i+1))/2;
			for(int j = 2; j<=sum/2; j++) {
				if(sum%j == 0) {
					count++;
				}
			}
			count+=2;
			System.out.println(i + "   " + sum + "   " + count);
		}
		System.out.println(--i);
	}

}
