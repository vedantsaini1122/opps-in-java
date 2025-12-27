class employe{
    private double salary;
    
    public void setsalary(double salary){
        if (salary > 0){
            this.salary = salary; 
        }
        else{
            System.out.println("invalid");
        }
    }
    public double getsalary(){
        return salary;
    }
}

public class employ {
    public static void main(String[] args){
     employe e = new employe();
     e.setsalary(5000);
     System.out.println(e.getsalary());
    }
}