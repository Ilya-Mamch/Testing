package homework_11;

public class Collection<T> {
    private Object[] array;
    private int size;
    private static final int defaultSize = 10;

    public Collection() {
        array = new Object[defaultSize];
        size = 0;
    }


    public Collection (int initialSize) {
        if (initialSize <= 0) {
            initialSize = defaultSize;
        }
        array = new Object[initialSize];
        size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        array[size] = element;
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return true;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        return (T) array[index];
    }

    public boolean contains(T element) {
        for (int i=0; i<size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i=0; i<size; i++) {
            array[i] = null;
        }
        size=0;
    }


    private void ensureCapacity() {
        if (size >= array.length) {
            int newSize = array.length * 2;
            Object[] newArray = new Object[newSize];
            for (int i=0; i<array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i=0; i<size; i++) {
            sb.append(array[i]);
            if (i != size-1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
