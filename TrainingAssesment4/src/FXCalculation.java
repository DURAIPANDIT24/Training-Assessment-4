import java.util.Scanner;

public class FXCalculation {
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter  Amount in Rs to customer wants to buy");
		long RupeesAmount = scanner.nextLong();
		System.out.println("Enter 1 USD Value");
		double USD = scanner.nextDouble();
		double Profit = 50;
		double USD_Amount = RupeesAmount / USD;
		double Total_Amount = USD_Amount + USD_Amount/2;
		double Exchange_Rate = ((RupeesAmount/Total_Amount ));
		System.out.println("Amount in Rs " + " Rs " + RupeesAmount);
		System.out.println("Exchange Rate " + String.format("%.2f", Exchange_Rate));
		System.out.println("Profit in $ " + "$ " + Profit);
		System.out.println("Amount to be paid by customer ($) " + "$ " + String.format("%.2f", Total_Amount));
	}
}
