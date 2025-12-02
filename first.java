 class Student{
    String name;
    int age;
    void stude(){
        System.out.println(name + " is studing in collage ");
        System.out.println("and his age is "+ age);
    }
 }
public class first {
    public static void main(String[] args){
        Student s1 = new Student();//object 1
        s1.name = "Vedant saini";
        s1.age = 19;
        s1.stude();
        
        Student s2 = new Student();//object 2
        s2.name = "Anshu saini";
        s2.age = 20;
        s2.stude();
    }
}
