package work;
public class Printnumber5_19 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=8;i++){
			for(j=0;j<8-i;j++){
				System.out.print("    ");
			}
			int num=1;
			System.out.printf("%4d",num);
			for(j=1;j<i;j++){
				num*=2;
				System.out.printf("%4d",num);
			}
			while(num!=1){
				num/=2;
				System.out.printf("%4d",num);
			}
			System.out.println();
		}
	}
}
