package test.by.bsu.training.geometry;

import by.bsu.training.geometry.action.CircleAction;
import by.bsu.training.geometry.entity.Circle;
import by.bsu.training.geometry.entity.Point;
import by.bsu.training.geometry.exception.IllegalDistException;
import by.bsu.training.geometry.exception.IsNotCircleException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by User on 25.09.2016.
 */
@RunWith(Parameterized.class)
public class IntersectionTester {

    int dist;
    private Circle circle;
    private boolean isSpecialIntersect;

    public IntersectionTester(Circle circle, int dist, boolean isSpecialIntersect) {
        this.circle = circle;
        this.dist = dist;
        this.isSpecialIntersect = isSpecialIntersect;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tableValues() {
        return Arrays.asList(new Object[][]{
                {new Circle(new Point(20, 5), 6), 1, true},
                {new Circle(new Point(-20, 5), 6), 1, true},
                {new Circle(new Point(-20, -5), 6), 1, true},
                {new Circle(new Point(20, -5), 6), 1, true},
                {new Circle(new Point(5, 20), 6), 1, true},
                {new Circle(new Point(-5, 20), 6), 1, true},
                {new Circle(new Point(-5, -20), 6), 1, true},
                {new Circle(new Point(5, -20), 6), 1, true},

                {new Circle(new Point(20, 5), 1), 1, false},
                {new Circle(new Point(-20, 5), 1), 1, false},
                {new Circle(new Point(-20, -5), 1), 1, false},
                {new Circle(new Point(20, -5), 1), 1, false},
                {new Circle(new Point(5, 20), 1), 1, false},
                {new Circle(new Point(-5, 20), 1), 1, false},
                {new Circle(new Point(-5, -20), 1), 1, false},
                {new Circle(new Point(5, -20), 1), 1, false},

                {new Circle(new Point(5, 5), 6), 1, false},
                {new Circle(new Point(-5, 5), 6), 1, false},
                {new Circle(new Point(-5, -5), 6), 1, false},
                {new Circle(new Point(5, -5), 6), 1, false},
                {new Circle(new Point(5, 5), 6), 1, false},
                {new Circle(new Point(-5, 5), 6), 1, false},
                {new Circle(new Point(-5, -5), 6), 1, false},
                {new Circle(new Point(5, -5), 6), 1, false},

                {new Circle(new Point(20, 5), 20), 15, true},
                {new Circle(new Point(-20, 5), 20), 15, true},
                {new Circle(new Point(-20, -5), 20), 15, true},
                {new Circle(new Point(20, -5), 20), 15, true},
                {new Circle(new Point(5, 20), 20), 15, true},
                {new Circle(new Point(-5, 20), 20), 15, true},
                {new Circle(new Point(-5, -20), 20), 15, true},
                {new Circle(new Point(5, -20), 20), 15, true}


        });
    }


    @Test
    public void isSpecialIntersectionTest() throws IllegalDistException, IsNotCircleException {
        CircleAction circleAction = new CircleAction();
        boolean expected = isSpecialIntersect;
        boolean actual = circleAction.isSpecialIntersection(circle, dist);
        Assert.assertEquals(circle.toString(), expected, actual);
    }


}
