package Tests;

import uy.edu.um.prog2.adt.Heap.*;
import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.Heap.Exceptions.EmptyHeapException;
import static org.junit.jupiter.api.Assertions.*;

class MyHeapImplTest {

    @Test
    void insert() {
        MyHeap<Integer> nuevoHeap = new MyHeapImpl<>(5, false);
        nuevoHeap.insert(5);
        nuevoHeap.insert(4);
        nuevoHeap.insert(3);
        nuevoHeap.insert(2);
        nuevoHeap.insert(1);
        // Verificamos que se hayan agregado correctamente los 5 elementos
        assertEquals(5, nuevoHeap.size());
        assertEquals(1, nuevoHeap.getMin());
        assertFalse(nuevoHeap.isEmpty());
    }


    @Test
    void deleteMin() throws EmptyHeapException {
        MyHeap<Integer> nuevoHeap = new MyHeapImpl<>(5, false);
        nuevoHeap.insert(5);
        nuevoHeap.insert(6);
        nuevoHeap.insert(7);
        nuevoHeap.insert(8);
        nuevoHeap.insert(9);
        // Eliminamos el elemento mas chico del Heap y lo guardamos en min
        int min = nuevoHeap.deleteMin();
        // Verificamos que min sea el minimo elemento eliminado de nuevoHeap
        assertEquals(5, min);
        assertEquals(4, nuevoHeap.size());
        assertEquals(6, nuevoHeap.getMin());
    }

    @Test
    void deleteMax() throws EmptyHeapException {
        MyHeap<Integer> nuevoHeap = new MyHeapImpl<>(5, true);
        nuevoHeap.insert(5);
        nuevoHeap.insert(6);
        nuevoHeap.insert(7);
        nuevoHeap.insert(8);
        nuevoHeap.insert(9);
        // Eliminamos el elemento mas grande de nuevoHeap y lo guardamos en max
        int max = nuevoHeap.deleteMax();
        // Verificamos que min sea el maximo elemento elminado de nuevoHeap
        assertEquals(9, max);
        assertEquals(4, nuevoHeap.size());
        assertEquals(8, nuevoHeap.getMax());
    }

    @Test
    void size() {
        MyHeap<Integer> nuevoHeap = new MyHeapImpl<>(5, true);
        // Verificamos que el tamaño de nuevoHeap sea 0
        assertEquals(0, nuevoHeap.size());
        // Agregamos 3 elementos a nuevoHeap
        nuevoHeap.insert(1);
        nuevoHeap.insert(2);
        nuevoHeap.insert(3);
        // Verificamos que el tamaño de nuevoHeap sea 3
        assertEquals(3, nuevoHeap.size());
    }
}