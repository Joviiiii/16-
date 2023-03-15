package work;
import java.util.Scanner;
public class Practice5_45 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double sum = 0;
		double sum2 = 0;
		for(int i=0;i<10;i++) {
			double num = input.nextDouble();
			sum += num;
			sum2 += num*num;
		}
		double mean = sum/10.0;
		double standardDeviation = Math.sqrt((sum2-Math.pow(sum,2)/10)/9);
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + (int)(standardDeviation*100000)/100000.0);
	}
}
