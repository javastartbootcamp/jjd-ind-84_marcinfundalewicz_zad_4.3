package pl.javastart.task;

public class Test {

    public static void main(String[] args) {
        Square square1 = new Square(2);
        Rectangle rectangle1 = new Rectangle(3, 4);
        Circle circle1 = new Circle(3);
        Triangle triangle1 = new Triangle(3, 4, 5, 4);
        double result1 = square1.calculateArea();
        double result2 = square1.calculatePerimeter();
        double result3 = rectangle1.calculateAre();
        double result4 = rectangle1.calculatePerimeter();
        double result5 = circle1.calculateArea();
        double result6 = circle1.calculatePerimeter();
        double result7 = triangle1.calculateArea();
        double result8 = triangle1.calculatePerimeter();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
    }
}
