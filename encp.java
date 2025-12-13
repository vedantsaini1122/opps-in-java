class student{
   private int age;
   private String name;
   
   public void setage(int a){
      if (a > 0){
        age = a ;
      }
    }
   public void setname(String n){
    name = n;
   }
   public int getage(){
    return age;
   }
   public String getname(){
    return name;
   }
}

public class encp {
    public static void main(String[] args){
      student s = new student();
      s.setage(20);
      s.setname("vedant saini");
      
      System.out.println(s.getage());
      System.out.println(s.getname());
    }
}
