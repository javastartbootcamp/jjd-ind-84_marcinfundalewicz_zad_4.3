package pl.javastart.task;

public class Test {

    public static void main(String[] args) {
        Square square1 = new Square(2);
        Rectangle rectangle1 = new Rectangle(3, 4);
        Circle circle1 = new Circle(3);
        Triangle triangle1 = new Triangle(3, 4, 5);
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double result1 = shapeCalculator.calculateCircleArea(circle1);
        double result2 = shapeCalculator.calculateRectPerimeter(rectangle1);
        double result3 = shapeCalculator.calculateSquareArea(square1);
        double result4 = shapeCalculator.calculateTrianglePerimeter(triangle1);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
