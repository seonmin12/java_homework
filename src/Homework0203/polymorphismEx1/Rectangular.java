package Homework0203.polymorphismEx1;

public class Rectangular extends Shape {
    private double width;
    private double height;



    public Rectangular(double width, double height, String name) {
        super(name);
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calculationArea() {
        double result = this.width* this.height;
        this.area =result;
    }

    @Override
    public void print() {
        System.out.printf("직사각형의 면적은 %.1f",this.area);
    }
}
