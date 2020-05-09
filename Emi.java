import java.text.SimpleDateFormat;
import java.util.Date;

public class Emi {

	double prnAmt;
	int noOfEmi;
	Date issuedDate;
	double totalPayable;
	double ROI = 0.01;
	double totalInterest;
	double monInterest;
	double monEmiPay;
	double monPrnAmt;
	SimpleDateFormat DateFor;
	String stringDate;
	MonthlyEmi monthEmi[];
	
	Emi(double loanPrincipleAmount, int totalEmi){
		prnAmt = loanPrincipleAmount;
		noOfEmi = totalEmi;
		issuedDate = new Date();
		DateFor = new SimpleDateFormat("dd MMMM yyyy");
		stringDate = DateFor.format(issuedDate);
		monthEmi = new MonthlyEmi[totalEmi];
	}
	
	void calcEmi() {
		
		totalInterest = prnAmt*ROI*noOfEmi;
		monInterest = prnAmt*ROI;
		totalPayable = totalInterest+prnAmt;
		monPrnAmt = prnAmt/noOfEmi;
		monEmiPay = monInterest+monPrnAmt;
		
		double remPrnAmt=totalPayable;
		
		for(int i=0;i<noOfEmi;i++) {
			remPrnAmt -= monEmiPay;
			MonthlyEmi emiMon = new MonthlyEmi(monPrnAmt, monInterest, monEmiPay,remPrnAmt,i+1);
			monthEmi[i] = emiMon;
		}
	}
	
	void printDetails() {
		System.out.println("Principle Amount :" + String.format("%.2f", prnAmt));
		System.out.println("Loan creation Date : "+stringDate);
		System.out.println("Number of Emi :"+ noOfEmi);
		System.out.println("Total Payable Amount : "+ String.format("%.2f",totalPayable));
		
		for(int i=0;i<noOfEmi;i++) {
			monthEmi[i].printDetails();
		}
	}
	
	
	
}
