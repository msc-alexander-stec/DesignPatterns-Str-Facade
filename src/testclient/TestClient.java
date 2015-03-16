package testclient;

import pkg.facade.BankAccountFacade;

public class TestClient {

	public static void main(String[] args) {

		System.out.println("Start: Facade");

		BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

		accessingBank.withdrawCash(50.0);
		accessingBank.withdrawCash(900.0);
		accessingBank.depositCash(200.0);

	}

}
