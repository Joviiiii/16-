package work;
public class Practice5_26 {
	public static void main(String[] args) {
		double e=1;
		double part=1;
		for(int i=1;i<=100000;i++) {
			part*=1.0/i;
			e+=part;
			if(i%10000==0) 
				System.out.println("if i = " + i +", e = " + e);
		}
	}
}
