import java.util.Scanner;

public class InterestComputation {
	public static Scanner scanner=new Scanner(System.in);
	static double SimpleInterest;
	static double Compound_Interest;
	public static double SimpleInterest(double Principal, double Rate, double Time_Period) {
		return SimpleInterest = ((Principal * Rate * Time_Period) / 100);
	}
	public static double Compound_Interest(double Rate, double Time_Period, double SimpleInterest) {
		return Compound_Interest = SimpleInterest * Math.pow(1.0 + Rate / 100.0, Time_Period) - SimpleInterest;
	}
	public static void main(String[] args) {
		System.out.println("Enter Principal Amount");
		double Principal =scanner.nextDouble();
		System.out.println("Enter Rate");
		double Rate=scanner.nextDouble();
		System.out.println("Enter Time_period");
		double Time_Period = scanner.nextDouble();
		System.out.println("Principal    :  " + "$ " + Principal);
		System.out.println("Rate of Interest    : " + Rate + " %");
		System.out.println("Today's Date   :  " + java.time.LocalDate.now());
		SimpleInterest = SimpleInterest(Principal, Rate, Time_Period);
		System.out.println("Amount at Maturity :  " + String.format("%.4f", SimpleInterest));
		Compound_Interest = Compound_Interest(Rate, Time_Period, SimpleInterest);
		System.out.println("Amount at Maturity (Compounding) :  " + String.format("%.4f", Compound_Interest));
	}

}
