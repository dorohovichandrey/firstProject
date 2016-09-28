package test.by.bsu.training.geometry;

import by.bsu.training.geometry.entity.Circle;
import by.bsu.training.geometry.action.CircleAction;
import by.bsu.training.geometry.entity.Point;
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
public class IsCircleTester {


    private Circle circle;
    private boolean isCircle;

    public IsCircleTester(Circle circle, boolean isCircle) {
        this.circle = circle;
        this.isCircle = isCircle;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tableValues() {
        return Arrays.asList(new Object[][]{
                {new Circle(new Point(-20, 5), -1), false},
                {new Circle(new Point(0, 0), 3), true},
                {new Circle(new Point(2, 3), 0), false}
        });
    }


    @Test
    public void isCircleTest() {
        CircleAction circleAction = new CircleAction();
        boolean expected = isCircle;
        boolean actual = circleAction.isCircle(circle);
        Assert.assertEquals(expected, actual);
    }


}
