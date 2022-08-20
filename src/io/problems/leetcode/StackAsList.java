package io.problems.leetcode;

/*
 * ArrayList implementation of stack
 * common operations are :::
 * clear()
 * pop()
 * topElement()
 * push(element)
 * isFull()
 * isEmpty()
 */
import java.util.ArrayList;

public class StackAsList {
    private ArrayList<Integer> stack = new ArrayList<>();
    private int size;

    public StackAsList(int size) {
        stack.ensureCapacity(size);
        this.size = size;
    }

    // clear the stack
    public void clear() {
        if(!isEmpty()) {
            stack.clear();
        }
    }

    public int pop() {
        if(!isEmpty()) {
            int removedElement = stack.remove(stack.size() - 1);
            return removedElement;
        }
        return -1;
    }

    public int topElement() {
        if(!isEmpty()) {
            return stack.get(stack.size() -1);
        }
        return -1;
    }
    public void push(int element) {
        if(!isFull()) {
            stack.add(element);
        }
    }

    public boolean isFull() {
        return stack.size() == this.size;
    }

    public boolean isEmpty() {
       return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackAsList stackAsList = new StackAsList(5);

        System.out.println("Is Full ? " + stackAsList.isFull());
        System.out.println("Is Empty ? " + stackAsList.isEmpty());
        System.out.println("Top Element ? " + stackAsList.topElement());
        System.out.println("Pop element ? " + stackAsList.pop());

        stackAsList.push(10);
        stackAsList.push(11);
        stackAsList.push(12);
        stackAsList.push(13);
        stackAsList.push(14);

        System.out.println("Is Full ? " + stackAsList.isFull());
        System.out.println("Is Empty ? " + stackAsList.isEmpty());
        System.out.println("Top Element ? " + stackAsList.topElement());
        System.out.println("Pop element ? " + stackAsList.pop());

        stackAsList.clear();

        System.out.println("Is Full ? " + stackAsList.isFull());
        System.out.println("Is Empty ? " + stackAsList.isEmpty());
        System.out.println("Top Element ? " + stackAsList.topElement());
        System.out.println("Pop element ? " + stackAsList.pop());
    }
}
