class bankaccount{
    private double balance;
    //method 1 for deposite
    public void deposite(double amount){
       if(amount > 0){
        balance += amount;
       }
       else{
        System.out.println("invalid amount");
       }
    }
   //method 2 for withdraw
   public void withdraw(double amount){
    if(amount>0 && amount < balance){
     balance -= amount;
    }
    else{
        System.out.println("unsufficent ammount");
    }
   }
   //getter
   public double getbalance(){
    return balance;
   }
}

public class ram {
    public static void main(String[] args){
    bankaccount b = new bankaccount();
     b.deposite(33450.43);
     b.withdraw(5499.3);
     System.out.println("balance left = " + b.getbalance());
    }
}
