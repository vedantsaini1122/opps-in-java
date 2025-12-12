class vehicle{
    void start(){
        System.out.println("easy mode of transport");
    }
}
class Bike extends vehicle{
    void kickstart(){
        System.out.println("it is a two vehicle");
    }
}
class car extends vehicle{
    void keystart(){
        System.out.println("it is a four vehicle");
    }
}
public class inherentance {
    public static void main(String[] args){
       Bike tvs = new Bike();
       tvs.start();
       tvs.kickstart();
       car nano = new car ();
       nano.start();
       nano.keystart();
    }
}
