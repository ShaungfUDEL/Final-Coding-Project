package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore)
	{
		double dInterestRate = 0;
		
		//TODO - RocketBLL RateBLL.getRate - make sure you throw any exception
		
		//		Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
		
		
		//TODO - RocketBLL RateBLL.getRate
		//			obviously this should be changed to return the determined rate
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		
		if(GivenCreditScore >= 600 && GivenCreditScore < 650){
			dInterestRate = rates.get(0).getdInterestRate();
		}
		else if(GivenCreditScore >= 650 && GivenCreditScore < 700){
			dInterestRate = rates.get(1).getdInterestRate();
		}
		else if(GivenCreditScore >= 700 && GivenCreditScore < 750){
			dInterestRate = rates.get(2).getdInterestRate();
		}
		else if(GivenCreditScore >= 750 && GivenCreditScore < 800){
			dInterestRate = rates.get(3).getdInterestRate();
		}
		else if(GivenCreditScore >= 800){
			dInterestRate = rates.get(4).getdInterestRate();
		}
		else{
			try {
				if(dInterestRate == 0){
					Exception e = new Exception("Credit score is too low");
					throw e;
				}
			}
			catch(Exception e){
			}
		}
		

		//TODO: Filter the ArrayList...  look for the correct rate for the given credit score.
		//	Easiest way is to apply a filter using a Lambda function.
		//
		//	Example... how to use Lambda functions:
		//			https://github.com/CISC181/Lambda
		
		return dInterestRate;
		
		
	}
	
	
	
	
	
	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
