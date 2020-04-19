package transaction;

public class SBICard implements CARD {

	String cardExpiry="12-sep-23";
	
	@Override
	public void changePIN() {	 
		System.out.println("SBI PIN CHANGED SUCCESSFULLY");
	}

	@Override
	public void withdraw() {
		System.out.println("CASH WITHDRAWN FROM SBI CARD SUCCESSFULLY");
	}

	@Override
	public void cardExpiry() {
		System.out.println("SBI CARD EXPIRY IS " + cardExpiry);
	}

	@Override
	public void deposit() {
		System.out.println("CASH DEPOSITED SUCCESSFULLY INTO SBI CARD");
	}
}
