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

    public static void main(String[]args) {
        Circle circle = new Circle();

        System.out.printf("The radius of the circle is %s\n", circle.getRadius());
        System.out.printf("The area of the circle is %.2f\n", circle.Area());
        System.out.printf("The peremeter of the circle is %.2f\n", circle.Perimeter());

        circle.setRadius(5);

        System.out.printf("The radius of the circle is %s\n", circle.getRadius());
        System.out.printf("The area of the circle is %.2f\n", circle.Area());
        System.out.printf("The peremeter of the circle is %.2f\n", circle.Perimeter());

        try {
            circle.setRadius(-25);
            System.out.println("A exception should have been thrown");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
