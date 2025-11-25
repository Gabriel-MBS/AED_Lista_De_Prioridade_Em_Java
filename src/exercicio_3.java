// =========================
// Exercicio: Implementar uma Lista de Prioridade Dupla
// =========================
import java.util.*;


public class exercicio_3 {
    private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private final PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private final Map<Integer, Integer> freq = new HashMap<>();


    public void insert(int value) {
        minHeap.add(value);
        maxHeap.add(value);
        freq.put(value, freq.getOrDefault(value, 0) + 1);
    }


    private void limpar(PriorityQueue<Integer> heap) {
        while (!heap.isEmpty() && freq.getOrDefault(heap.peek(), 0) == 0) {
            heap.poll();
        }
    }


    public int getMax() {
        limpar(maxHeap);
        return maxHeap.peek();
    }


    public int getMin() {
        limpar(minHeap);
        return minHeap.peek();
    }


    public int removeMax() {
        limpar(maxHeap);
        int val = maxHeap.poll();
        freq.put(val, freq.get(val) - 1);
        return val;
    }


    public int removeMin() {
        limpar(minHeap);
        int val = minHeap.poll();
        freq.put(val, freq.get(val) - 1);
        return val;
    }
}