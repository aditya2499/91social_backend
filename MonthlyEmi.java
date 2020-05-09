import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MonthlyEmi {

	double monPrnAmt;
	double monIntAmt;
	double monEmiAmt;
	Date emiDate;
	double remPrnAmt;
	int EmiNum;
	SimpleDateFormat DateFor;
	String stringDate;
	
	//
	
	MonthlyEmi(double monPrnAmt, double monIntAmt, double monEmi, double remPrnAmt ,int EmiNum){
		this.monPrnAmt = monPrnAmt;
		this.monIntAmt = monIntAmt;
		this.monEmiAmt = monEmi;
		this.remPrnAmt = remPrnAmt;
		this.EmiNum = EmiNum;
		DateFor = new SimpleDateFormat("dd MMMM yyyy");
		emiDate= new Date();
		Calendar myCal = Calendar.getInstance();
	    myCal.setTime(emiDate);   
	    myCal.add(Calendar.MONTH, EmiNum);   
	    emiDate = myCal.getTime();
		stringDate = DateFor.format(emiDate);
	}
	
	void printDetails() {
		System.out.println("EmiNum : "+ EmiNum+", Principle Emi :"+String.format("%.2f", monPrnAmt)+", InterestEmi :"+String.format("%.2f", monIntAmt)+", totalEmi :"+String.format("%.2f",monEmiAmt)+", Emi Date :"+stringDate+", Principle remaining :"+String.format("%.2f", remPrnAmt));
	}
	
	
}
