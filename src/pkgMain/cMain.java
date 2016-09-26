package pkgMain;

import java.util.Scanner;

public class cMain {
	public static void main(String[] args) {
		
		Scanner answer = new Scanner(System.in);
		
		System.out.print("Enter tuition amount: ");
		double tuition = answer.nextDouble()*4;
		
		System.out.print("Enter interest amount: ");
		double interest = answer.nextDouble();
		
		double Total= total(tuition, interest);
		
		System.out.printf("The total cost will be $%8.2f", Total);
	}
		
		private static double total(double tuition, double interest){
		double price= tuition;
		for(int i=0;i<2;i++){
			tuition=tuition*interest;
			price+=tuition;
		}
		return price;
		
	}

}
