package DynamicList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

class DynamicList <T> implements Iterable{

    public T arr[];

    private int capacity;
    private int numberOfElements;
    public DynamicList() {
        arr = (T[]) new Object[1];
        capacity = 1;
        numberOfElements = 0;
    }

    public boolean add(Object o){
        if (o == null) {
            return false;
        }

        if (numberOfElements == capacity) {
            T temp[] = (T[]) new Object[2 * capacity];
            for (int i = 0; i < capacity; i++) {
                temp[i] = arr[i];
            }
            capacity *= 2;
            arr = temp;

        }
        arr[numberOfElements] = (T) o;
        numberOfElements++;
        return true;
    }

    public boolean addAtIndex(Object o, int index) {
        if (o == null) {
            return false;
        }
        if (index > capacity) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == capacity) {
            add(o);
            return true;
        }
        arr[index] = (T) o;
        System.out.printf("Your object was added at position %d. %n", index);
        return true;
    }

    public int size() {
        return capacity;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public Object getObjectFromIndex(int index) {
        if (index > arr.length || arr[index] == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void pop(int index) {
        if (arr[index] == null) {
            return;
        }
        arr[index] = null;
        numberOfElements--;
        return;
    }

    public int getO(Object o){
        if (o == null){
            return -1;
        }
        int count = 0;
        for (int i = 0; i < numberOfElements; i++) {
            if (arr[i] == o){
                return count;
            }
            count ++;
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }


}