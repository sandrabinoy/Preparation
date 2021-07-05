package week1.day5;

public class MinStack {

    private int[] stack;
    private int index = 0;
    private int capacity = 0;
    private int minValue = 0;
    private int minIndex = 0;

    public MinStack() {
        capacity = 16;
        stack = new int[capacity];
    }

    public void push(int value) {
        //Resize array if too small
        if(index == capacity) {
            resize(true);
        }
        findMinValue(value);
        stack[index++] = value;
    }

    public void pop() {

    }

    public void resize(boolean sizeUp) {
        if(sizeUp) {
            capacity *= 2;
        }
        else {
            capacity /= 4;
        }
        int[] resizedArray = new int[capacity];
        for(int i = 0; i < capacity; i++) {
            resizedArray[i] = stack[i];
        }
        stack = resizedArray;
    }

    public void findMinValue(int value) {
        //Set minValue when the first element is inserted
        if(index == 1) {
            minValue = stack[0];
            minIndex = 0;
        }
        //Check minValue is still the smallest
        if(minValue > value) {
            minValue = value;
            minIndex = index;
        }
    }

}
