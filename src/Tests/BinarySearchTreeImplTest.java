package Tests;

import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.BinarySearchTree.BinarySearchTree;
import uy.edu.um.prog2.adt.BinarySearchTree.BinarySearchTreeImpl;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeImplTest {

    @Test
    void add() {
        //va a la izquierda
        BinarySearchTree<Integer,String> arbol1= new BinarySearchTreeImpl<>();
        arbol1.add(5,"Quinto");
        arbol1.add(1,"Primero");
        assertEquals("Primero",arbol1.find(5).getLeft().getValue());
        //va a la derecha
        BinarySearchTree<Integer,String> arbol2 = new BinarySearchTreeImpl<>();
        arbol2.add(1,"Primero");
        arbol2.add(3,"Tercero");
        assertEquals("Tercero",arbol2.find(1).getRight().getValue());
    }

    @Test
    void remove() {
        BinarySearchTree<Integer,String> arbol = new BinarySearchTreeImpl<>();
        arbol.add(1,"Primero");
        arbol.remove(1);
        assertNull(arbol.find(1));
    }

    @Test
    void find() {
        BinarySearchTree<Integer,String> arbol = new BinarySearchTreeImpl<>();
        arbol.add(1,"Primero");
        arbol.add(2,"Segundo");
        arbol.add(3,"Tercero");
        assertEquals("Tercero",arbol.find(3).getValue());
    }
}