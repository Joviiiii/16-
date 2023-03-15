package work;
public class Practice5_33 {
	public static void main(String[] args) {
		for(int i=2;i<10001;i++) {
			int sum=1;
			for(int j=2;j<Math.sqrt(i);j++) {
				if(i%j==0) {
					sum+=j+i/j;
					if(j==i/j)
						sum--;
				}
			}
			if(sum==i)
				System.out.println(i);
		}
	}
}
