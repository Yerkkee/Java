public class SavingsAccount extends BankAccount{

    double rate = 0.025;
    int savingsNumber = 0;
    String accountNumber;

    public SavingsAccount(String name, double amount){
        super(name, amount);
        accountNumber = getAccountNumber();
        setAccountNumber(accountNumber+"-"+savingsNumber++);
    }
    public SavingsAccount(SavingsAccount oldAccount, double amount){
        super(oldAccount, amount);
        savingsNumber = oldAccount.savingsNumber++;
        setAccountNumber(oldAccount.accountNumber+"-"+savingsNumber++);
    }

    public void postInterest(){
        setBalance(getBalance()+(getBalance()*rate)/12);
    }
    @Override
    public String getAccountNumber(){
        return super.getAccountNumber();
    }
}
