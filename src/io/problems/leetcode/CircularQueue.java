package io.problems.leetcode;
/*
 ** Question : https://leetcode.com/problems/design-circular-queue/
 * rear position to insert : rear = (rear + 1) % queue.length;
 * front position to insert : rear = (front + 1) % queue.length;
 * REF How Circular Queue Works ? : https://www.programiz.com/dsa/circular-queue
 */

public class CircularQueue {
        int[] queue;
        int front = 0, rear = -1, len = 0;

        public CircularQueue(int k) {
            queue = new int[k];
        }

        public boolean enQueue(int val) {
            if (!isFull()) {
                rear = (rear + 1) % queue.length;
                queue[rear] = val;
                len++;
                return true;
            }
            return false;
        }

        public boolean deQueue() {
            if (!isEmpty()) {
                front = (front + 1) % queue.length;
                len--;
                return true;
            }
            return false;
        }

        public int Front() {
            return isEmpty() ? -1 : queue[front];
        }

        public int Rear() {
            return isEmpty() ? -1 : queue[rear];
        }

        public boolean isEmpty() {
            return len == 0;
        }

        public boolean isFull() {
            return len == queue.length;
        }

    public static void main(String[] args) {
            CircularQueue circularQueue = new CircularQueue(5);
            circularQueue.enQueue(100);
            circularQueue.enQueue(101);
            circularQueue.enQueue(102);
            circularQueue.enQueue(103);
            System.out.println("Front = " + circularQueue.Front());
            System.out.println("Rear = " + circularQueue.Rear());
            System.out.println("Is queue empty ? " + circularQueue.isEmpty());
            System.out.println("Is queue full ? " + circularQueue.isFull());
            circularQueue.deQueue();
        }
    }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
