package homework_6;

public class CreditCard {
    long numberAccount;
    int sumAccount;


    public CreditCard (long number, int sum){
        this.numberAccount = number;
        this.sumAccount = sum;

    }

    public void addMoney(long money){
        this.sumAccount += money;
    }

    public void withdrawMoney (long money){
        this.sumAccount -= money;
    }

    public long getBalance(){
        return this.sumAccount;
    }


    public void getCardInformation(){
        System.out.println("Номер аккаунта: " + numberAccount);
        System.out.println("Сумма на счету: " + sumAccount);
    }
}
