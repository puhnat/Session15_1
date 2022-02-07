package LearnArray;

public class IndexStorage {
    public int size;

    public IndexStorage(int size) {
        if (size <= 0) {
            throw new IllegalStateException("Массив может состоять из одного или более элементов (" + size + ")");
        }
        this.size = size;
    }

    public int get(int index) {
        return index % 2 == 0 ? index : -index;
    }

    public int size() {
        return size;
    }

    public int[] reverse() {

        if (size <= 0) {
            throw new IllegalStateException("Массив может состоять из одного или более элементов (" + size + ")");
        }

        int[] resArray = new int[size];

        for (int i = 0; i < size; i++) {
            resArray[i] = get(size-1-i);
        }
        return resArray;
    }
}
