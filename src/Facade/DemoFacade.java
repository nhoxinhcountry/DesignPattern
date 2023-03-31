package Facade;

public class DemoFacade {
    public static void main(String[] args) {
        BankAccountFacade b1 = new  BankAccountFacade("Account 1", 51960052);
        CashManager c1 = new CashManager(5000000);
        CheckAccount check = new CheckAccount("Account 10");
        c1.deposit(5000000);
        check.isValid("Account 5");
        b1.deposit(5000000);
        b1.withdraw(1000000);

    }

}
