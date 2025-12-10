//parent class...
class Shape {
    void area() {
        System.out.println("Calculate area");
    }
}

class Circle extends Shape {
    void area(double radius) {       
        double area = 3.14 * radius * radius;
        System.out.println("Actual area of circle: " + area);
    }
}

class Triangle extends Shape {
    void area(int length, int width) {  
        int area = length * width;
        System.out.println("Area of triangle: " + area);
    }
}

// Main class
public class overloading {
    public static void main(String[] args) {
        Circle c = new Circle();   
        c.area(4);        

        Triangle t = new Triangle(); 
        t.area(4, 2);                
    }
}
