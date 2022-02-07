package LearnArray;

public class ArrayIndexStorage extends IndexStorage {

    protected int[] arr;

    public ArrayIndexStorage(int[] arr) {
        super(arr.length);
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int size() {
        return arr.length;
    }

}
