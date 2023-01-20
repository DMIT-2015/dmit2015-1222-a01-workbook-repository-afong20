package dmit2015.model;

/**
 * This class models a Circle shape.
 *
 * @author Aaron Fong
 * @version 2023.01.20
 */
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new RuntimeException("Radius value must be greater than 0");
        }
    }

    public Circle(double newRadius) {
        radius = newRadius;
    }

    public Circle() {
        radius = 1;
    }

    /**
     * Compute and return the area of the circle
     * @return area of circle
     */
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Compute nd return the diameter of the circle
     * @return diameter of circle
     */
    public double diameter() {
        return radius * 2;
    }

    /**
     * Compute and return the circumference o the circle
     * @return circumference of circle
     */
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
