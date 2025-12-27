class bank{
   private double balance;
   private int withdraw ;

   public double getBalance(){
    if(balance>0){
       System.out.println("you can withdraw");
    }
    else {
        System.out.println("no balance");
    }
     return balance ;
   }

   public void setbalance(double balance){
    if (balance > 0){
        this.balance = balance;
     }
    else{
        System.out.println("no balance");
    }
   }
   public void withdrawamount(int withdrawamount){
    if(withdrawamount > 0 && withdrawamount<=balance){
        balance -= withdrawamount;
        withdraw = (int) withdrawamount;
        System.out.println("sucessfully withdraw");
    }
    else{
        System.out.println("invalade amount");
    }
   }
}

public class acc {
    public static void main (String[] args){
     bank b = new bank();
     b.setbalance(2380);
     System.out.println("current balance = " + b.getBalance());  
      b.withdrawamount(500);  
      System.out.println("Current balance: " + b.getBalance()); 
  }
}