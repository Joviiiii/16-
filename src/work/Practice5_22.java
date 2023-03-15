package work;
import java.util.Scanner;
public class Practice5_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double rate = input.nextDouble();
		double monthlyPayment = loanAmount*(rate/1200)/(1-1/Math.pow(1+rate/1200, years*12));
		//System.out.println("\nMonthly Payment: " + (int)(monthlyPayment*100)/100.0);
		System.out.printf("\nMonthly Payment: %.2f\n",monthlyPayment);
		//System.out.println("Total Payment: " + (int)(monthlyPayment * 1200)/100.0 + "\n");
		System.out.printf("Total Payment: %.2f\n\n",monthlyPayment*12);
		System.out.print("Payment#\tInterest\tPrincipal\tbalance\n");
		double balance = loanAmount;
		int i;
		double interest,principal;
		for(i=1;i<=years*12;i++) {
			interest = rate/1200 * balance;
			principal = monthlyPayment - interest;
			balance -=principal;
			//System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n",i,interest,principal,balance);
		}
	}
}
