package pl.javastart.task;

public class Square {
    double a;

    Square(double a) {
        this.a = a;
    }

    double calculatePerimeter() {
        return 4 * a;
    }

    double calculateArea() {
        return a * a;
    }
}
