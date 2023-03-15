package work;
public class Tuition5_7 {
	public static void main(String[] args) {
		double tuition = 10000;
		double growthRate = 0.05;
		int i=0;
		for(i=0;i<10;i++){
			tuition*=(1+growthRate);		
		}
		System.out.println(tuition);
		double sum=tuition;
		for(i=0;i<3;i++){
			tuition*=(1+growthRate);
			sum+=tuition;
		}
		System.out.println(sum);
	}
}
