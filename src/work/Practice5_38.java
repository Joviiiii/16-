package work;
import java.util.Scanner;
public class Practice5_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in decimal: ");
		int num = input.nextInt();
		int[] decimal = new int[1000];
		int[] octal = new int[1000];
		int i=0,j=0,k=0;
		while(num>0) {
			decimal[i] = num % 2;
			i++;
			num /= 2;
		}
		while(j<i) {
			octal[k]=decimal[j]+2*decimal[j+1]+4*decimal[j+2];
			k++;
			j+=3;
		}
		System.out.print("The number in octal is: ");
		for(k=k-1;k>=0;k--)
			System.out.print(octal[k]);
	}
}
