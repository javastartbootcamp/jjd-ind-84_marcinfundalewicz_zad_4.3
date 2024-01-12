package pl.javastart.task;

public class Rectangle {
    double a;
    double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    double calculateAre() {
        return a * b;
    }
}
