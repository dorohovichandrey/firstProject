package test.by.bsu.training.geometry;

import by.bsu.training.geometry.entity.Circle;
import by.bsu.training.geometry.action.CircleAction;
import by.bsu.training.geometry.exception.IsNotCircleException;
import by.bsu.training.geometry.entity.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 25.09.2016.
 */
public class PerimeterTester {
    @Test
    public void countPerimeterTest() throws IsNotCircleException
    {
        Circle circle=new Circle(new Point(10,5), 16);
        CircleAction circleAction=new CircleAction();
        double actual=circleAction.countPerimeter(circle);
        double expected=100.48;
        Assert.assertEquals(actual,expected,0.5);
    }
}
