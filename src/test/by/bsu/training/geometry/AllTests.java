package test.by.bsu.training.geometry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by User on 25.09.2016.
 */
@Suite.SuiteClasses( { PerimeterTester.class,
                        SquareTester.class,
                        IsCircleTester.class,
                        IntersectionTester.class,
                        ExceptionTester.class} )
@RunWith(Suite.class)
public class AllTests {
}
