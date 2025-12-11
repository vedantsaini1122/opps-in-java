class MathOperation {
    int multiply(int a, int b) {
        return a * b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class cal {
    public static void main(String[] args) {

        MathOperation m = new MathOperation();

        System.out.println("multiply(4, 5) = " + m.multiply(4, 5));
        System.out.println("multiply(3.5, 2.2) = " + m.multiply(3.5, 2.2));
        System.out.println("multiply(2, 3, 4) = " + m.multiply(2, 3, 4));
    }
}

