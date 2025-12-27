 class student{
    private int marks;

    public void setmarks(int marks){
        if (marks>0 &&marks<=100){
            this.marks = marks;
        }
        else{
        System.out.println("invalide details");
        }
    }
     public int getmarks(){
        return marks ;
     }
 }

public class polymorphism {
    public static void main(String[] args){
        student sc = new student();
        sc.setmarks(23);
        System.out.println(sc.getmarks());

        student sc2 = new student();
        sc2.setmarks(103);
        System.out.println(sc2.getmarks());
    }
}
