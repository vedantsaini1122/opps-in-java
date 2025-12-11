 //parent class 
 class Bank {
    int getrate() {
        return 0;
    }
}
//subclass 1
class HDFC extends Bank {
    int getrate() {
        return 5;
    }
}
// subclass 2
class SBI extends Bank {
    int getrate() {
        return 7;
    }
}
// subclass 3
class ICICI extends Bank {
    int getrate() {
        return 6;
    }
}

public class poly {
    public static void main(String[] args) {

        Bank b;  
        b = new HDFC();  
        System.out.println("HDFC Interest Rate: " + b.getrate() + "%");

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getrate() + "%");

        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.getrate() + "%");
    }
}
