package Facade;
public class BankAccountFacade {
    private  String accountName ;
    private  int code ;
    CheckAccount checkAccount ;
    SecurityCodeChecker securityCodeChecker ;
    CashManager cashManager ;
    public  BankAccountFacade(String accountName, int code){
        this.accountName = accountName ;
        this.code = code ;
        checkAccount = new CheckAccount(accountName);
        securityCodeChecker = new SecurityCodeChecker(code) ;
        cashManager = new CashManager(1000000);
    }

    public void deposit(double cashAmount){
        if(checkAccount.isValid(accountName) && securityCodeChecker.isValid(code)){
            cashManager.deposit(cashAmount);
            System.out.println("Nạp tiền thành công");
        }else {
            System.out.println("Lỗi nạp tiền");
        }

    }
    public void withdraw(double cashAmount){
        if(checkAccount.isValid(accountName)
                && securityCodeChecker.isValid(code)
                && cashManager.haveEnoughMoney(cashAmount)){
            cashManager.withdraw(cashAmount);
            System.out.println("Rút tiền thành công");
        }else {
            System.out.println("Lỗi rút tiền");
        }

    }

}
