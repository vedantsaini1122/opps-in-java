class collage{
    String depatment;
    String branch;
    String year;
    void stude(){
        System.out.println(depatment);
         System.out.println(branch);
          System.out.println(year);
    }
}
public class second {
    public static void main(String[] args){
        collage global = new collage();
          global.depatment = "MBA";
          global.branch = "FINANCE";
          global.year = "1st";
          global.stude();
    

          collage gyanganga = new collage();
           gyanganga.depatment = "B tech";
            gyanganga.branch = "computer science ";
             gyanganga.year = "3rd year";  
          gyanganga.stude();

    }
}
