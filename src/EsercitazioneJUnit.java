import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EsercitazioneJUnit {

    @Test
    public void test1() {
        Trapezio a = new Trapezio(3,2,1);
        float risAtteso = 2.5f;
        float risOttenuto = (float) a.calcolaArea();
        assertEquals(risAtteso, risOttenuto, 0);
    }

    @Test
    public void test2() {
        Trapezio b = new Trapezio(6,5,5);
        float risAtteso = 27.5f;
        float risOttenuto = (float) b.calcolaArea();
        assertEquals(risAtteso, risOttenuto, 0);
    }

    @Test
    public void test3() {
        Trapezio c = new Trapezio(32,5,1);
        float risAtteso = 18.5f;
        float risOttenuto = (float) c.calcolaArea();
        assertEquals(risAtteso, risOttenuto, 0);
    }
}
