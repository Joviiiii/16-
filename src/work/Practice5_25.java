package work;
public class Practice5_25 {
	public static void main(String[] args) {
		double pi=0;
		for(int i=1;i<=100000;i++) {
			if(i%2==1) 
				pi+=4.0/(2*i-1);
			else 
				pi-=4.0/(2*i-1);
			if(i%10000==0) 
				System.out.println("if i = " + i +", pi = " + pi);
		}
	}
}
