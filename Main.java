import java.util.Scanner;

public class Main {

	public static void main(String str[])
	{ 
		System.out.println("Enter Loan Amount :");
	  Scanner sc = new Scanner(System.in);
	  double loanPrincipleAmount = sc.nextDouble();
	  System.out.println("Enter Number of Emi :");
	  int totalEmi = sc.nextInt();
	  
	  Emi emiDetails =new Emi(loanPrincipleAmount,totalEmi);
	  System.out.println("rum");
	  emiDetails.calcEmi();
	  emiDetails.printDetails();
	}
}
