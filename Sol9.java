package project_euler;

public class Sol9 {

	public static void main(String[] args) {
		for(int i = 0; i<=1000; i++) {
			for(int j = 0; j<=1000; j++) {
				for(int k = 0; k<=1000; k++) {
					if((i*i + j*j == k*k) && i+j+k == 1000) {
						System.out.println(i + "   "+ j + "   "+ k);
						System.out.println(i*j*k);
					}
				}
			}
		}
	}

}
