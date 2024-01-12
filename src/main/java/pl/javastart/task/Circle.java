package pl.javastart.task;

public class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double calculateArea() {
        return Math.PI * r * r;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}
