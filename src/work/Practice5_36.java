package work;
import java.util.Scanner;
public class Practice5_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int d = 0,cnt=0;
		long num = input.nextLong();
		long num1=num;
		for(int i=9;i>0;i--) {
			int digit = (int)(num % 10);
			if(num==0)
				cnt++;
			num /= 10;
			d += digit * i;
		}
		for(;cnt>0;cnt--)
			System.out.print("0");
		System.out.print(num1);
		d = d % 11;
		if(d<10)
			System.out.println(d);
		else
			System.out.println("X");
	}
}
