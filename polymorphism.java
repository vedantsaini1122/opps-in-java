class calculator{
    int add(int a,int b){
         return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int minus(int a,int b){
        return a-b;
    }
}

public class polymorphism {
    public static void main(String[] args){
        calculator cal = new calculator();
        System.out.println(cal.add(3,9));
        System.out.println(cal.add(23.4,4.5));
        System.out.println(cal.minus(6,3));

    }
}
