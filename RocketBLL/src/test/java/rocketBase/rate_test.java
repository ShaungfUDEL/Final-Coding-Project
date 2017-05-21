package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score

	@Test
	public void testGetRate(){
		RateBLL test = new RateBLL();
		int TestRate = (int)test.getRate(600);
		assertEquals(TestRate,7);
	}
	@Test
	public void testGetPayment(){
		assertEquals(RateBLL.getPayment(4.0, 360.0, 100000.0, 0.0, false),-400000.0,.1);
	}
}
