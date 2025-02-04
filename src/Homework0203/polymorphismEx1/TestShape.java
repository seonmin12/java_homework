package Homework0203.polymorphismEx1;

import java.util.ArrayList;

public class TestShape {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		Rectangular rectangle = new Rectangular(10.0,20.0, "사각형");
		Circle circle = new Circle(10.0, "원" );
		shapes.add(circle);
		shapes.add(rectangle);
		for(Shape shape : shapes){
			if(shape instanceof Circle){
				System.out.printf("%s의 면적은 %f%n",((Circle) shape).getName(),((Circle) shape).getRadius()*((Circle) shape).getRadius()*Math.PI);

			}else if(shape instanceof Rectangular){
				System.out.printf("%s의 면적은 %.1f", shape.getName(),((Rectangular) shape).getHeight()*((Rectangular) shape).getWidth());
			}


		}



		
		
	}
}