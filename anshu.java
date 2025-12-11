class vehicle{
    void speed(){
        System.out.println("maximum speed ");
    }
}
class Bike extends vehicle{
    void speed(){
   System.out.println("maximum speed of bike is 80 km/hr");
    }
}
class car extends vehicle{
    void speed(){
        System.out.println("maximum speed of car is 120 km/hr");
    }
}
class truck extends vehicle{
    void speed(){
        System.out.println("maximum speed of truck is 60 km/hr");
    }
}
public class anshu {
    public static void main(String[] args){
    vehicle v ;
    v = new Bike();
    v.speed();
    v = new car ();
    v.speed();
    v = new truck ();
    v.speed();
    }
}
