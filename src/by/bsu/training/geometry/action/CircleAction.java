package by.bsu.training.geometry.action;

import by.bsu.training.geometry.entity.Circle;
import by.bsu.training.geometry.exception.IllegalDistException;
import by.bsu.training.geometry.exception.IsNotCircleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by User on 24.09.2016.
 */
public class CircleAction {


    private static Logger LOG = LogManager.getLogger();



    public CircleAction() {
    }

    public boolean isCircle(Circle circle) {

        return circle.getR() > 0;
    }

    public boolean isSpecialIntersection(Circle circle, int dist) throws IllegalDistException, IsNotCircleException {
        LOG.warn("dist=" + dist);
        if (dist <= 0) {
            throw new IllegalDistException("dist=" + dist);
        }
        LOG.warn("r=" + circle.getR());
        if (!isCircle(circle)) {
            throw new IsNotCircleException("r=" + circle.getR());
        }

        int dX = countInterDistByX(circle);
        int dY = countInterDistByY(circle);
        return dX==dist ^ dY==dist;
    }

    private int countInterDistByX(Circle circle)
    {
        return circle.getR()-Math.abs(circle.getCenter().getX());
    }

    private int countInterDistByY(Circle circle)
    {
        return circle.getR()-Math.abs(circle.getCenter().getY());
    }

    public double countSquare(Circle circle) throws IsNotCircleException
    {
        LOG.warn("r=" + circle.getR());

        if (!isCircle(circle)) {
            throw new IsNotCircleException("r=" + circle.getR());
        }

        return Math.PI*Math.pow(circle.getR(),2);
    }

    public double countPerimeter(Circle circle) throws IsNotCircleException
    {
        LOG.warn("r=" + circle.getR());


        if (!isCircle(circle)) {
            throw new IsNotCircleException("r=" + circle.getR());
        }

        return 2*Math.PI*circle.getR();

    }
}
