package dmit2015.model;

import lombok.Data;

/**
 * This class models a Rectangle shape.
 *
 * @author Aaron Fong
 * @version 2022.01.20
 */
@Data
public class Rectangle {
    private double length;
    private double width;

    /**
     * Computes and return the area of the rectangle.
     * @return area of rectangle
     */
    public double area() {
        return width * length;
    }

    /**
     * Computes and return the perimeter of the rectangle.
     * @return perimeter of rectangle
     */
    public double perimeter() { return 2*(width+length); }

    /**
     * Computes and return the diagonal of the rectangle.
     * @return diagonal of rectangle
     */
    public double diagonal() { return Math.sqrt(Math.pow(width,2) + Math.pow(length,2)); }
}
