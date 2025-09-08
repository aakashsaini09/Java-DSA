interface Shape {
    int area();    
}
class Triangle implements Shape {
    int base;     
    int height;

    // Constructor
    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    public int area() {
        return base * height;
    }
}
public class InterF {
    public static void main(String[] args) {
        Triangle t = new Triangle(10, 5);  
        System.out.println("Area of Triangle: " + t.area());
    }
}