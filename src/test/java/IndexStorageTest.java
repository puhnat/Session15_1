import LearnArray.ArrayIndexStorage;
import LearnArray.IndexStorage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IndexStorageTest {

    @Test
    public void isWorkIndexStorage(){
        final int SIZE_STORAGE = 10;

        int[] arrResult;

        IndexStorage indexStorage1 = new IndexStorage(SIZE_STORAGE);
        arrResult = new int[indexStorage1.size()];
        for (int i = 0; i < arrResult.length; i++) {
            arrResult[i] = indexStorage1.get(i);
        }

        int[] expect = {-9, 8, -7, 6, -5, 4, -3, 2, -1, 0};
        int[] actual = indexStorage1.reverse();

        Assertions.assertArrayEquals(expect, actual);
    }

    @Test
    public void arrayIndexStorageTest(){
        final int SIZE_ARRAY = 15;

        // Заполняем массив для конструктора ArrayIndexStorage
        int[] arrResult = new int[SIZE_ARRAY];
        for (int i = 0; i < arrResult.length; i++) {
            arrResult[i] = i;
        }

        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arrResult);

        int[] expect = {14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] actual = arrayIndexStorage.reverse();

        Assertions.assertArrayEquals(expect, actual);

    }

}
