// =========================
// Exercicios: Encontrar os K Maiores Elementos
// =========================
import java.util.*;


public class exercicio_1 {
    public static List<Integer> findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();


        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }


        return new ArrayList<>(minHeap);
    }
}