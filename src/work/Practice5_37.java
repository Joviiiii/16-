package work;
import java.util.Scanner;
public class Practice5_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in decimal: ");
		int num = input.nextInt();
		int[] decimal = new int[1000];
		int i=0;
		while(num>0) {
			decimal[i] = num % 2;
			i++;
			num /= 2;
		}
		System.out.print("The number in binnary is: ");
		for(i=i-1;i>=0;i--)
			System.out.print(decimal[i]);
	}
}
