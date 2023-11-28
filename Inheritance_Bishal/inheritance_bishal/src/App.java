public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();
        
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
}
} 
interface Area {
    double calculateArea();
}

interface Perimeter {
    double calculatePerimeter();
}

class Rectangle implements Area, Perimeter {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}


    

