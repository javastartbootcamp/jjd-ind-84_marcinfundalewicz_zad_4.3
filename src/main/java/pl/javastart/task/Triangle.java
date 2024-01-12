package pl.javastart.task;

public class Triangle {
    double a;
    double b;
    double c;
    double h;

    Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    double calculatePerimeter() {
        return a + b + c;
    }

    double calculateArea() {
        return a * h * 0.5;
    }
}
