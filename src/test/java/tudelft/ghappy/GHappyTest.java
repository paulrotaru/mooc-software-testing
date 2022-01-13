package tudelft.ghappy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GHappyTest {

    @Test
    public void test1(){
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void test2(){
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("ggxxxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void test3(){
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xggxxgx");
        Assertions.assertFalse(result);
    }
}
