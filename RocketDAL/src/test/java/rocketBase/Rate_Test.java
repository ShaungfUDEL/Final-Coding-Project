package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	@Test
	public void Testrate_Test(){
		ArrayList<RateDomainModel> alRatesTest = RateDAL.getAllRates();
		assertEquals(alRatesTest.get(0).getiMinCreditScore(),600);
	}
	//TODO - RocketDAL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketDAL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score


}
