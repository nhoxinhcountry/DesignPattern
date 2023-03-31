package Facade;

public class CashManager {
    private  double cashAmount ;
    public CashManager(double cashAmount){
        this.cashAmount = cashAmount ;
    }

    public void deposit(double cashAmount){
        this.cashAmount += cashAmount ;
        System.out.println("Số tiền trong tài khoản: " +this.cashAmount);
    }
    public boolean haveEnoughMoney(double cashAmount){
        return this.cashAmount > cashAmount ;
    }
    public void withdraw(double cashAmount){
        this.cashAmount -= cashAmount ;
        System.out.println("Số tiền trong tài khoản: " +this.cashAmount);
    }
}



