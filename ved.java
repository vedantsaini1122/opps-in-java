// parent class;
class animal {
    void sound(){
        System.out.println("sound of animal");
    }
}
//sub class 1;
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}
class cat extends animal {
    void sound (){
        System.out.println("cat maau");
    }
}
public class ved{
    public static void main(String[] args){
    animal an;
    an = new dog();
    an.sound();
    an = new cat ();
    an.sound();
    }
}
