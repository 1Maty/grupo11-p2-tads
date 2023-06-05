package Tests;

import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.Queue.Exceptions.EmptyQueueException;
import uy.edu.um.prog2.adt.Queue.MyQueue;
import uy.edu.um.prog2.adt.linkedlist.MyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void enqueue() throws EmptyQueueException {
        MyQueue<Integer> queue = new MyLinkedList<>();
        queue.enqueue(1);
        assertEquals(1,queue.size());
        assertEquals(queue.dequeue(),1);
    }

    @Test
    void dequeue() throws EmptyQueueException {
        MyQueue<Integer> queue = new MyLinkedList<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        assertEquals(1,queue.dequeue());
    }

    @Test
    void isEmpty() throws EmptyQueueException {
        MyQueue<Integer> queue = new MyLinkedList<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}