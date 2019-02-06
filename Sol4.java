package project_euler;

public class Sol4 {

	public static void main(String[] args) {
		String temp;
		int u,v;
		String num = "0";
		for(int i = 100; i<=999; i++) {
			for(int j = 100; j<=999; j++) {
				temp = Integer.toString(i*j);
				u=temp.length()-1;
				v=0;
				
				for(int x = 0; x<=temp.length()-1; x++) {
					if(u>=v) {
						if(temp.charAt(v) != temp.charAt(u)) {
							break;
						}
						else {
							u--;
							v++;
						}
					}
					else {
						if(Integer.parseInt(num)<Integer.parseInt(temp)) {
							num = temp;
						}	
					}
				}
			}
		}
		
		System.out.println(num);

	}

}
