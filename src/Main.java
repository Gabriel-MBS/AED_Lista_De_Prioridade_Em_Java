// =========================
// Arquivo Main: Teste dos exercicios
// =========================
import java.util.*;


public class Main {
    public static void main(String[] args) {


// ==== Teste Exercicio 1 ====
        int[] arr = {5, 2, 8, 1, 9, 3};
        System.out.println("K maiores: " + exercicio_1.findKthLargest(arr, 3));


// ==== Teste Exercicio 2 ====
        List<List<Integer>> listas = new ArrayList<>();
        listas.add(Arrays.asList(1, 4, 7));
        listas.add(Arrays.asList(2, 5, 8));
        listas.add(Arrays.asList(3, 6, 9));
        System.out.println("Mesclado: " + exercicio_2.mergeKSortedLists(listas));


// ==== Teste Exercicio 3 ====
        exercicio_3 dpq = new exercicio_3();
        dpq.insert(10);
        dpq.insert(4);
        dpq.insert(7);
        System.out.println("Min: " + dpq.getMin());
        System.out.println("Max: " + dpq.getMax());


// ==== Teste Exercicio 4 ====
        int[] heap = {1, 3, 5, 7, 9, 11};
        System.out.println("É MinHeap? " + exercicio_4.isMinHeap(heap));


// ==== Teste Exercicio 5 ====
        exercicio_5 mf = new exercicio_5();
        mf.addNum(10);
        mf.addNum(20);
        mf.addNum(30);
        System.out.println("Mediana: " + mf.findMedian());
    }
}