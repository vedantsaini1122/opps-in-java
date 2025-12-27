class bankaccount{
    private double balance;
      // method 1 to set the balance 
        public void setbalance(double amount){
            if(amount > 0){
             balance = balance + amount;
            }
            else{
                System.out.println("unsufficent balance");
            }
        }

      // method 2 to add amount
        public void added(double amount){
            if(amount>0){
                balance += amount;
            }
            else{
                System.out.println("negative balance can not be added");
            }
        }

     // method 3 to withdraw money 
      public void withdraw (double amount){
        if (amount>0 && amount<balance){
            balance -= amount;
        }
        else{
            System.out.println("unable to withdraw this much ammount ");
        }
      }
      public double getbalance(){
        return balance;
      }
    }

    public class polyi{
         public static void main(String[] args){
    bankaccount b = new bankaccount();
    b.setbalance(25000);
    System.out.println(b.getbalance());

    b.added(577);
    System.out.println(b.getbalance());

    b.withdraw(2000);
    System.out.println(b.getbalance());
    }
}