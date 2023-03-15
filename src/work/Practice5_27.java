package work;
public class Practice5_27 {
	public static void main(String[] args) {
		int j=0;
		for(int i=101;i<=2100;i++) {
			if((i%4==0 && i%100!=0)||i%400==0) {
				System.out.print(i + " ");
				j++;
				if(j%10==0)
				System.out.println();
			}
		}
		System.out.println("\nThe number of leap years from 101 to 2100 is " + j);
	}
}
