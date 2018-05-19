
public class Atm {

	private int balance;
	private String requiredPin = "1234";

	public Atm(int balance) {
		this.balance = balance;
	}

	public int getBalance() {

		return balance;
	}

	public void withdrawl(int amount) {
		if (amount > balance) {
			balance -= 0;

		} else if (amount % 10 != 0) {
			balance -= 0;
		} else {
			balance -= amount;

		}
	}

	public void deposit(int amount) {
		balance += amount;

	}

	public boolean allowAccess(String enteredPin) {
		if (requiredPin.equals(enteredPin)) {
			return true;

		} else {
			return false;
		}

	}

	public String getRequiredPin() {

		return requiredPin; 
		
	}

}
