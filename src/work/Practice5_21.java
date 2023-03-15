package work;
import java.util.Scanner;
public class Compare5_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
		for(double i=5;i<=8;i+=0.125){
			System.out.printf("%.3f%%\t\t",i);
			//月支付=（总金*月利率）/（1-1/（1+月利率）的月数次方）
			double month=loanAmount*(i / 1200)/(1 - 1 / Math.pow((1 + (i / 1200)),years * 12));
			System.out.printf("%.2f\t\t",month);
			double total=month*years*12;
			System.out.printf("%.2f\t\t\n",total);
		}
	}
}
