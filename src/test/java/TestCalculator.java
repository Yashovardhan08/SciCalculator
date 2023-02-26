import org.sciCalculator.Main;

import static org.junit.Assert.*;

//import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @org.junit.Test
    public void TestLog() {
        Double res = 1.791759469228055;
        assertEquals(res, Main.NatLog(6.0));
        res =  4.499809670330265;
        assertEquals(res,Main.NatLog(90.0));
    }


    @org.junit.Test
    public void TestSqrt() {
        Double ans = 2.0;
        assertEquals(ans,Main.Sqrt(4.0));
        ans = 3.1622776601683795;
        assertEquals(ans,Main.Sqrt(10.0));
    }


    @org.junit.Test
    public void TestPower() {
        Double res =  16.0;
        assertEquals(res,Main.power(2.0,4.0));
        res = 64.0;
        assertEquals(res,Main.power(8.0,2.0));
    }
}
