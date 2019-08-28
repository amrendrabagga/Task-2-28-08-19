package transaction;

public class Machine {

	CARD card;
	
	public void insertCARD(CARD card) {
		this.card = card;
	}
	
	public void withdraw() {
		card.withdraw();
	}
	
	public void cardExpicy() {
		card.cardExpiry();
	}
	public void changePIN() {
		card.changePIN();
	}
	public void deposit() {
		card.deposit();
	}
	
	public static void main(String args[]) {
		Machine machine = new Machine();
		
		machine.insertCARD(new SBICard());
		machine.deposit();
		machine.withdraw();
		machine.changePIN();
		machine.cardExpicy();
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		Machine machine1 = new Machine();
		
		machine1.insertCARD(new HDFCCard());
		machine1.deposit();
		machine1.withdraw();
		machine1.changePIN();
		machine1.cardExpicy();
	}
}
