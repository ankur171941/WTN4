package WiproTalentNext4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class primeStringTest {
    primeString pp =new primeString();
    @Test
    public void primeStr()
    {
        assertEquals("od",pp.primestring("good"));
    }
    @Test
    public void primeStr1()
    {
        assertEquals("No Prime String Found",pp.primestring("go"));
    }
    @Test
    public void primeStr2()
    {
        assertEquals("od mrgckrniy",pp.primestring("good morning chitkara university"));
    }


}
