package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	
	private RateDomainModel rate;
	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
	
	public RateException(String message,RateDomainModel r){
		super(message);
		rate = r;
	}

	public RateDomainModel getRate() {
		return rate;
	}
	
	
	
}
