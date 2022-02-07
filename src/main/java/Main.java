import LearnArray.ArrayIndexStorage;
import LearnArray.IndexStorage;

import java.util.Arrays;

public class Main {

    static final int SIZE_STORAGE = 10;
    static final int SIZE_ARRAY = 15;

    public static void main(String[] args) {

        int[] arrResult;

        IndexStorage indexStorage = new IndexStorage(SIZE_STORAGE);
        arrResult = new int[indexStorage.size()];
        for (int i = 0; i < arrResult.length; i++) {
            arrResult[i] = indexStorage.get(i);
        }
        System.out.println("Массив IndexStorage до    перевертывания : " + Arrays.toString(arrResult));
        arrResult = indexStorage.reverse();
        System.out.println("Массив IndexStorage после перевертывания : " + Arrays.toString(arrResult));
        System.out.println();

        // Заполняем массив для конструктора ArrayIndexStorage
        arrResult = new int[SIZE_ARRAY];
        for (int i = 0; i < arrResult.length; i++) {
            arrResult[i] = i;
        }

        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arrResult);

        System.out.println("Массив ArrayIndexStorage до    перевертывания : " + Arrays.toString(arrResult));
        arrResult = arrayIndexStorage.reverse();
        System.out.println("Массив ArrayIndexStorage после перевертывания : " + Arrays.toString(arrResult));
    }
}
