class Pen{
    String type;
    String colour;

    public void printcolour(){// first function that represent colour.
        System.out.println(this.colour);
    }
    public void printtype(){//second fn that represent type
        System.out.println(this.type);
    }
}

public class third {
   public static void main(String[] args){
     Pen ved = new Pen();
     ved.colour ="blue";
     ved.type = "gel";

     Pen anshu = new Pen();
     anshu.colour = "black";
     anshu.type = "dot";

     ved.printcolour();
     anshu.printtype();
   } 
}
