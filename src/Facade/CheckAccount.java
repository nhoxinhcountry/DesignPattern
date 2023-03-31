package Facade;

public class CheckAccount {
    private String accName ;
    public CheckAccount(String accountName){
        accName = accountName ;
    }
    public boolean isValid(String accountName){
        return accName == accountName ;
    }
}



