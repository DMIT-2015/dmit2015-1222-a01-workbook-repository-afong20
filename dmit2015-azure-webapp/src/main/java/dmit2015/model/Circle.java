package dmit2015.model;

public class Circle {
    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0) {
            throw new RuntimeException("Radius must be a postive non-zero number");
        }
        this.radius = radius;
    }

    public Circle() {
        radius = 1;
    }
    public Circle(double radius) {
        setRadius(radius);
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

    public double Perimeter() {
        return Math.PI * 2 * radius;
    }
}
