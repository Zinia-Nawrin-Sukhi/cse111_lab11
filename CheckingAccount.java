public class CheckingAccount extends Account
{
  public CheckingAccount(String n, int c)
  {
    super(n);
    setBalance(c);
  }
  public void printAccountInfo()
  {
    System.out.println("======================================");
    System.out.println("Name: "+ getName());
    System.out.println("Account Number: "+getAccountNumber());
    System.out.println("Balance: "+getBalance());
    if( getBalance() <500)
    {
      System.out.println(" Your balance is less than the minimum amount");
    }
    System.out.println("======================================");
    
  }
  
  public String deposit(double b)
  {
    if(b<=0.0)
    {
      return "Please enter amount greater than Zero";
    }
    else
    {
      setBalance(getBalance()+b);
     
      return " Deposit Successful";
    }
  }
  public String withdraw(double b )
  {
    if(b <=0.0)
    {
      return "Please enter amount greater than Zero";
    }
    else if(b< getBalance()) 
      
    {
      setBalance(getBalance()-b);
      return " Withdraw Successful";
    }
    else
    {
      return "You do not have enough funds";
    }
  }
}  
      