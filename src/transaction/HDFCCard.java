package transaction;

public class HDFCCard implements CARD {

	String cardExpiry="25-OCT-24";
	
	@Override
	public void changePIN() {
		System.out.println("HDFC PIN CHANGED SUCCESSFULLY");
	}

	@Override
	public void withdraw() {
		System.out.println("CASH WITHDRAWN FROM HDFC CARD SUCCESSFULLY");
	}

	@Override
	public void cardExpiry() {
		System.out.println("HDFC CARD EXPIRY IS " + cardExpiry);
	}

	@Override
	public void deposit() {
		System.out.println("CASH DEPOSITED SUCCESSFULLY INTO HDFC CARD");
	}
}
