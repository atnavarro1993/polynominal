import static org.junit.Assert.*;
import  org.junit.Before;
import  org.junit.Test;

import java.util.NoSuchElementException;
public class PolynominalTest {
    private Polynominal poly;
    @Before
    public void setup(){
        poly = new Polynominal();
    }

    @Test
    public void TestIfPolyIszeropoly(){
        assertEquals(1,poly.size());
    }
    

}