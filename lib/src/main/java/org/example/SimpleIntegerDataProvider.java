package org.example;

import java.util.Random;

public class SimpleIntegerDataProvider {
    public Integer[] getData(int dataLength) {
        Integer[] result = new Integer[dataLength];

        Random random = new Random();

        for(int i = 0; i < dataLength; i++) {
            result[i] = random.nextInt(10000);
        }

        return result;
    }
}
