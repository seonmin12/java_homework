package Homework0203.polymorphismEx1;

public class Circle extends Shape {
    private double radius;
    public Circle(){}

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculationArea() { //오버라이딩은 public
        double result = this.getRadius() * this.getRadius() * Math.PI;
    }

    @Override
    public void print() {
        System.out.println("원의 면적은" + this.area);
    }
}
