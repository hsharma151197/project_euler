package project_euler;

public class Sol7 {

	public static void main(String[] args) {
		int count = 1;
		int j;
		int i;
		int k;
		for(i = 2; count <= 10001; i++) {
			label2: for(j = 2; j<i; j++) {
				for(k = 1; j*k<=i; k++) {
					if(j*k == i) {
						break label2;
					}
				}
			}
			if(j == i) {
				count++;
			}
		}
		
		System.out.println(--i);

	}

}
