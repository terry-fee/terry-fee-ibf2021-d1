package terryfee.tf;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("Assert true");
        assertTrue( true );
    }

    @Test
    public void myTest() {
        new App().myMethod();
    }
}
