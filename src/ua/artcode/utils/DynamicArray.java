package ua.artcode.utils;

import java.util.Arrays;

/**
 * @author Serhii Bilobrov
 * @since 1.7
 */
public class DynamicArray {

    private Object[] arr;
    private int lastFreeIndex;

    public DynamicArray() {
        arr = new Object[10];
        lastFreeIndex = 0;
    }

    public boolean add(Object el) {
        if (el == null) {
            return false;
        }

        extendIfNeeded();

        arr[lastFreeIndex] = el;
        lastFreeIndex++;

        return true;
    }

    private void extendIfNeeded() {
        if (lastFreeIndex >= arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
    }

    public Object get(int index) {
        return arr[index];
    }


    public int size() {
        return lastFreeIndex;
    }

    public Object[] toArr() {
        return Arrays.copyOfRange(arr,0,lastFreeIndex);
    }
}
