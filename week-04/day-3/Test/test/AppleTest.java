import org.junit.Before;
import org.junit.Test;

import java.applet.Applet;

import static org.junit.Assert.*;

public class AppleTest {

    private Apple apple;

    @Before
    public void createApple() {
        apple = new Apple();
    }


    @Test
    public void getApple() {
        Apple apple = new Apple();
        assertEquals(apple.getApple(), "apple");
    }
}