package project_euler;

public class Sol2 {

	public static void main(String[] args) {
		int temp = 2;
		int n1 = 1, n2 = 2;
		for(int n3 = 3; n3<=4000000; n3 = n1 + n2) {
			n1 = n2;
			n2 = n3;
			System.out.println(n1 + "  " + n2 + "  " + n3);
			if(n3%2 == 0) {
				temp += n3;
			}	
		}
		
		System.out.println(temp);

	}

}
