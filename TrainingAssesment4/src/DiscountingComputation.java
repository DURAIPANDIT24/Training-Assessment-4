import java.util.Scanner;

public class DiscountingComputation {
	public static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter Amount Needed in xx years");
		double Amount_Needed_in_xx_years =scanner.nextDouble();
		System.out.println("Enter Rate of interest");
		double Rate=scanner.nextDouble();
		System.out.println("Enter Time_period");
		int Time_Period = scanner.nextInt();
		//P = A / (1 + r/n) nt
		System.out.println("Amount Needed in xx years :  " + "$ " + Amount_Needed_in_xx_years);
		System.out.println("Rate of Interest    : " + Rate + " %");
		System.out.println("Today's Date   :  " + java.time.LocalDate.now());
		double PrincipalAMount=  Amount_Needed_in_xx_years /(Math.pow((1 + Rate / 100), Time_Period));
		System.out.println("Amount to be invested today" +  String.format("%.2f",PrincipalAMount) );
	}
}
