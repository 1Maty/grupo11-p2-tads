package Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import uy.edu.um.prog2.adt.Hash.*;
import uy.edu.um.prog2.adt.Hash.Exceptions.HashLleno;
public class MyHashImplTest {

    @Test
    void add() throws HashLleno {
        MyHash<Integer, String> nuevoHash = new MyHashImpl<>(3);
        nuevoHash.add(1, "Uno");
        nuevoHash.add(2, "Dos");
        // Verificamos que se hayan agregado correctamente los elementos.
        assertEquals(nuevoHash.size(),2);
        assertEquals(nuevoHash.get(2).getValue(),"Dos");
    }


    @Test
    void remove() throws HashLleno {
        MyHash<Integer, String> nuevoHash = new MyHashImpl<>(3);
        nuevoHash.add(1, "Uno");
        nuevoHash.add(2, "Dos");
        // Eliminamos el elemento 2
        nuevoHash.remove(2);
        // Verificamos que el elemento 2 haya sido borrado.
        assertEquals(nuevoHash.size(),1);
        assertNull(nuevoHash.get(2));
    }


    @Test
    void get() throws HashLleno {
        MyHash<Integer, String> nuevoHash = new MyHashImpl<>(5);
        nuevoHash.add(1, "Uno");
        nuevoHash.add(2, "Dos");
        nuevoHash.add(3, "Tres");
        HashNode<Integer, String> nuevoNodo = nuevoHash.get(2);
        // Verificamos que el nodo 2 haya sido obtenido correctamente.
        assertEquals(nuevoNodo.getKey(),2);
        assertEquals(nuevoNodo.getValue(),"Dos");
    }


    @Test
    void size() throws HashLleno {
        MyHash<Integer, String> nuevoHash = new MyHashImpl<>(3);
        nuevoHash.add(1, "Uno");
        nuevoHash.add(2, "Dos");
        // Verificamos que el tamaño del hash sea
        assertEquals(nuevoHash.size(),2);
    }


    @Test
    void isEmpty() throws HashLleno {
        MyHash<Integer, String> nuevoHash = new MyHashImpl<>(3);
        nuevoHash.add(1, "Uno");
        // Luego de agregar un elemento verificamos que el hash no esta vacio
        assertFalse(nuevoHash.isEmpty());
        nuevoHash.remove(1);
        // Luego de eliminar el unico elemento verificamos que el hash este vacio.
        assertTrue(nuevoHash.isEmpty());

    }
}
