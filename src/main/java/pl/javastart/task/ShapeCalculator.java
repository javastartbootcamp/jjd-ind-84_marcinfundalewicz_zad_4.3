package pl.javastart.task;

public class ShapeCalculator {
    Square square;
    Rectangle rectangle;
    Circle circle;
    Triangle triangle;

    double calculateSquareArea(Square square) {
        return square.a * square.a;

    }

    double calculateCircleArea(Circle circle) {
        return Math.PI * circle.r * circle.r;

    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.a + triangle.b + triangle.c;

    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return 2 * rectangle.a + 2 * rectangle.b;

    }
}
