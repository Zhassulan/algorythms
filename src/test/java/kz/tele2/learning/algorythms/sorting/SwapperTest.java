package kz.tele2.learning.algorythms.sorting;

import kz.tele2.learning.algorythms.swapping.Swapper;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SwapperTest {

    int x = 5;
    int y = 10;

    @Test
    public void swap1() {
        Swapper swapper = new Swapper(x, y);
        swapper.print();
        swapper.swap1();
        assertTrue(swapper.getX() == 10);
        assertTrue(swapper.getY() == 5);
        swapper.print();
    }

    @Test
    public void swap2() {
        Swapper swapper = new Swapper(x, y);
        swapper.print();
        swapper.swap2();
        assertTrue(swapper.getX() == 10);
        assertTrue(swapper.getY() == 5);
        swapper.print();
    }

}
