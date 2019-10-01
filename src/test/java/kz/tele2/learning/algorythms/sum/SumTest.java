package kz.tele2.learning.algorythms.sum;

import kz.tele2.learning.algorythms.sum.geek.subarray.GFG;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class SumTest {

    @Test
    public void testSubarraySum()  {
        String[] params = {
                "2",
                "5 12",
                "1 2 3 7 5",
                "10 15",
                "1 2 3 4 5 6 7 8 9 10"};
        GFG.main(params);
    }

    public InputStream getFileStream() throws FileNotFoundException {
        Class sumTest = SumTest.class;
        InputStream inputStream = sumTest.getResourceAsStream("/subarray_sum.properties");
        return inputStream;
    }

}
