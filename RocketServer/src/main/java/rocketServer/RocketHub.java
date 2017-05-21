package rocketServer;

import java.io.IOException;

import netgame.common.Hub;
import rocketBase.RateBLL;
import rocketData.LoanRequest;


public class RocketHub extends Hub {

	private RateBLL _RateBLL = new RateBLL();
	
	public RocketHub(int port) throws IOException {
		super(port);
	}

	@Override
	protected void messageReceived(int ClientID, Object message) {
		System.out.println("Message Received by Hub");
		
		if (message instanceof LoanRequest) {
			resetOutput();
			
			LoanRequest lq = (LoanRequest) message;
			
			//	TODO - RocketHub.messageReceived

			//	You will have to:
			//	Determine the rate with the given credit score (call RateBLL.getRate)
			//		If exception, show error message, stop processing
			//		If no exception, continue
			//	Determine if payment, call RateBLL.getPayment
			//	
			//	you should update lq, and then send lq back to the caller(s)
			try{
				double rate = RateBLL.getRate(lq.getiCreditScore());
				lq.setdRate(rate);
			}
			catch(Exception e){
				System.out.print(e.getMessage());
			}
			lq.setdPayment(RateBLL.getPayment(lq.getdRate(), lq.getiTerm(), lq.getExpenses(), 0, false));
			sendToAll(lq);
		}
	}
}