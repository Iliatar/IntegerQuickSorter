package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerQuickSorterTests {
    private static final int TEST_ITERATIONS_NUM = 100;

    @Test
    private void testSorter() {
        SimpleIntegerDataProvider dataProvider = new SimpleIntegerDataProvider();
        IntegerQuickSorter sorter = new IntegerQuickSorter();

        for (int i = 0; i < TEST_ITERATIONS_NUM; i++) {
            Integer[] data = dataProvider.getData(5000);
            data = sorter.sort(data);
            Assertions.assertTrue(checkArraySort(data));
        }
    }

    private boolean checkArraySort(Integer[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i-1]) return false;
        }
        return true;
    }
}
