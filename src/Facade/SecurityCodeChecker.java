package Facade;

public class SecurityCodeChecker {
  private int code ;
  public SecurityCodeChecker(int securityCode){
      code = securityCode ;
  }
  public boolean isValid(int securityCode){
      return code == securityCode ;
  }
}



