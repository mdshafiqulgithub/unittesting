package UnitTesting;

import org.testng.Assert;
import org.testng.asserts.Assertion;

public class TestCalculator {

    public static void main(String[] args)
    {

        Calculator calOb = new Calculator();

        try
        {

            Assert.assertEquals(calOb.addition(10, 15), 25);
            System.out.println("Test Case Passed ");


        } catch (AssertionError e)
        {
            String message = e.getMessage();
            System.out.println("Error Message :"+message);
        }


        try
        {
            Assert.assertEquals(calOb.multiply(10.50, 15.50), 25);

        } catch (AssertionError e)
        {
            String message = e.getMessage();
            System.out.println("Error Message :"+message);
        }

        try
        {

            Assert.assertEquals(calOb.subtraction(10,90),90);

        } catch (AssertionError e)
        {
            String message = e.getMessage();
            System.out.println("Error Message :"+message);
        }


    }


}
