package work;
import java.util.Scanner;
public class Pyramid5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int line = input.nextInt();
		int i,j;
		for(j=1;j<=line;j++){
			for(i=0;i<line-j;i++)
				System.out.print("   ");
			for(i=j;i>=1;i--)
				System.out.printf("%3d",i);
			for(i=2;i<=j;i++)
				System.out.printf("%3d",i);
			System.out.println();
		}
	}
}
