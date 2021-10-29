package bai_6_ke_;

public class Rectangle {
    private double height = 1.0;
    private double width = 1.0;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return (this.height * this.width);
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth()
                + " and height = " + getHeight()
                + ", \nwhich is a subclass of " + super.toString();
    }
}
