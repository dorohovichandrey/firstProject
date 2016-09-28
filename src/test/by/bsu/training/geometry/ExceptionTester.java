package test.by.bsu.training.geometry;

import by.bsu.training.geometry.action.CircleAction;
import by.bsu.training.geometry.entity.Circle;
import by.bsu.training.geometry.entity.Point;
import by.bsu.training.geometry.exception.IllegalDistException;
import by.bsu.training.geometry.exception.IsNotCircleException;
import org.junit.Test;

/**
 * Created by User on 25.09.2016.
 */
public class ExceptionTester {
    @Test(expected = IsNotCircleException.class)
    public void InterWithIsNotCircleExpTest1() throws IllegalDistException, IsNotCircleException {
        Circle circle=new Circle(new Point(10,8),-3);
        CircleAction circleAction = new CircleAction();
        circleAction.isSpecialIntersection(circle, 1);

    }

    @Test(expected = IsNotCircleException.class)
    public void InterWithIsNotCircleExpTest2() throws IllegalDistException, IsNotCircleException {
        Circle circle=new Circle(new Point(10,8),0);
        CircleAction circleAction = new CircleAction();
        circleAction.isSpecialIntersection(circle, 1);

    }

    @Test(expected = IllegalDistException.class)
    public void InterWithIllegalDistExpTest1() throws IllegalDistException, IsNotCircleException {
        Circle circle=new Circle(new Point(10,8),3);
        CircleAction circleAction = new CircleAction();
        circleAction.isSpecialIntersection(circle, 0);

    }

    @Test(expected = IllegalDistException.class)
    public void InterWithIllegalDistExpTest2() throws IllegalDistException, IsNotCircleException {
        Circle circle=new Circle(new Point(10,8),3);
        CircleAction circleAction = new CircleAction();
        circleAction.isSpecialIntersection(circle, -3);

    }

    @Test(expected = IsNotCircleException.class)
    public void countPerimeterWithIsNotCircleExpTest1() throws IsNotCircleException
    {
        Circle circle=new Circle(new Point(10,5), -3);
        CircleAction circleAction=new CircleAction();
        circleAction.countPerimeter(circle);

    }

    @Test(expected = IsNotCircleException.class)
    public void countPerimeterWithIsNotCircleExpTest2() throws IsNotCircleException
    {
        Circle circle=new Circle(new Point(10,5), 0);
        CircleAction circleAction=new CircleAction();
        circleAction.countPerimeter(circle);

    }

    @Test (expected = IsNotCircleException.class)
    public void countSquareWithIsNotCircleExpTest1() throws IsNotCircleException
    {
        Circle circle=new Circle(new Point(10,5), -3);
        CircleAction circleAction=new CircleAction();
        circleAction.countSquare(circle);
    }

    @Test (expected = IsNotCircleException.class)
    public void countSquareWithIsNotCircleExpTest2() throws IsNotCircleException
    {
        Circle circle=new Circle(new Point(10,5), 0);
        CircleAction circleAction=new CircleAction();
        circleAction.countSquare(circle);
    }




}
