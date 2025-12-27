class bank {
   private double balance;

   public void setbalance(double balance){
       if(balance>0){
        this.balance = balance;
       }
       else{
        System.out.println("invalad amount");
       }
   }
   public double getbalance(){
    return balance;
   }
}
public class inherentance {
     public static void main(String[] args){
      bank b = new bank();
      b.setbalance(234.34);
      System.out.println(b.getbalance());
     }
    }