class Account
{
	public void createAccount()
	{
	int Balance;
	System.out.println("Account created");
	Balance=500;
	}
}
class Saving extends Account
{
	public void createAccount()
	{
	System.out.println("Saving Account Created");
	balance=1000;	
	}
}
public class Application Tester
{
public static void main(String args[])
{
	Account account = new SavingAccount();
	account.createAccount();
	System.out.println("Balance:" +account.balance);
}
}