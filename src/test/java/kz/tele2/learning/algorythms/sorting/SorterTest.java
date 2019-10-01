package kz.tele2.learning.algorythms.sorting;

import kz.tele2.learning.algorythms.sorting.BubbleSort;
import org.junit.Test;

public class SorterTest {

    @Test
    public void bubbleSortTest()    {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(array);
    }
}
