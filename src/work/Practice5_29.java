package work;
import java.util.Scanner;
public class Practice5_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year you want to check: ");
		int year = input.nextInt();
		System.out.print("Enter the day of the week for the first day of the year: ");
		int week = input.nextInt();
		String[] month= {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		int flag[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||year%400==0)
			flag[2]=29;
		for(int i=1;i<=12;i++) {
			//System.out.println("\t\t\t" + month[i] + " " + year);
			System.out.println("           " + month[i] + " " + year);
			//System.out.println("--------------------------------------------------------");
			System.out.println("------------------------------------");
			//System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
			{
				for(int j=0;j<5*(week%7);j++)
					System.out.print(" ");
				for(int k=1;k<=flag[i];k++) {
					week=(week+1)%7;
					if(k<10)
						System.out.print("   " + k + " ");
					else
						System.out.print("  " + k + " ");
					if(week%7==0)
						System.out.println();
				}
				System.out.println("\n");
			}
		}
	}
}
