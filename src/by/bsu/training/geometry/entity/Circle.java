package by.bsu.training.geometry.entity;

/**
 * Created by User on 24.09.2016.
 */
public class Circle {
    private Point center;
    private int r;

    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public int getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", r=" + r +
                '}';
    }
}
