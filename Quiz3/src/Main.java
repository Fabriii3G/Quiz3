import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList ListaDoble = new DoubleLinkedList();
        for (int i = 0; i <= 2000; i++){
            ListaDoble.add(i);
        }
        BinarySearchTree ArbolBinario = new BinarySearchTree();
        for (int i = 0; i <= 2000; i++){
            ArbolBinario.insert(i);
        }

        long StartDLL = System.nanoTime();
        ListaDoble.contains(1440);
        long EndDLL = System.nanoTime();
        long DiffDLL = EndDLL - StartDLL;
        System.out.println("Nanosegundos de DLL: " + DiffDLL);

        long StartBST = System.nanoTime();
        ArbolBinario.search(1440);
        long EndBST = System.nanoTime();
        long DiffBST = EndBST - StartBST;
        System.out.println("Nanosegundos de BST: " + DiffBST);
    }
}