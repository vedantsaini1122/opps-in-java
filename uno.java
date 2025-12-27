class persion{
    int age;
    String name; // properties of presion that a normal persion have 
    String gender;

    void walk(){
        System.out.println(name + " is walking "); //behaviour of persion
    }
    void talk(){
        System.out.println(name + " has good communitation skill");
    }
    void walk(int steps){
        System.out.println(name + " walks " + steps + " steps a day");
    }
}
public class uno {
    public static void main(String[] args){
      persion p1 = new persion();
      p1.age = 19;
      p1.name = "vedant";
      p1.gender = "male";
      System.out.println(p1.age +" "+ p1.name +" "+ p1.gender);

      persion p2 = new persion();
      p2.age = 26;
      p2.name = "anshu";
      p2.gender = "male";
      System.out.println(p2.age);
      System.out.println(p2.name);
      System.out.println(p2.gender);
      
      p1.walk();
      p2.talk();
      p2.walk(1000);
    }
}
