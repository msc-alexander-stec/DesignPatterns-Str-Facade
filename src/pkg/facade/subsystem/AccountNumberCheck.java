package pkg.facade.subsystem;

public class AccountNumberCheck {

	private int accountNumber = 12345678;
	
	//
	// Getter
	//
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//
	//
	//
	
	public boolean accountActive(int accNumToCheck) {
		
		if (accNumToCheck == getAccountNumber()) {
			return true;
		}
		else {
			return false;
		}
	}
}
