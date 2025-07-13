package tnsif.day13.syncronization;

public interface Bank {

	
	static final int MINBAl=5000;
	static final int DAILY_LIMIT=25000;
	void deposit (int amt) throws DepositLimitException;
	void withdraw(int amt) throws InsufficientBalanceException;
}
