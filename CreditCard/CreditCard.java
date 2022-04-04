import javax.sound.midi.SysexMessage;

public class CreditCard {

    private Money balance = new Money(0);
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        this.creditLimit = limit;
        this.owner = newCardHolder;
}
    public Money getBalance(){
        return balance;
    }
    public Money getCreditLimit(){
        return creditLimit;
    }
    public String getPersonals(){
        return owner.toString();
    }
    public void charge(Money amount){
        if(creditLimit.compareTo(amount)>0){
            creditLimit = creditLimit.subtract(amount);
            balance = balance.add(amount);
        }
        else System.out.println("Exceeds credit limit");
    }
    public void payment(Money amount){
        balance = balance.subtract(amount);
    }
}
