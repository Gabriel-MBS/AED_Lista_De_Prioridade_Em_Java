// =========================
// Exercicio: Mesclagem de K Listas Ordenadas
// =========================
import java.util.*;


public class exercicio_2 {


    static class Node {
        int value;
        int listIndex;
        int elementIndex;


        Node(int value, int listIndex, int elementIndex) {
            this.value = value;
            this.listIndex = listIndex;
            this.elementIndex = elementIndex;
        }
    }


    public static List<Integer> mergeKSortedLists(List<List<Integer>> lists) {
        PriorityQueue<Node> heap = new PriorityQueue<>(Comparator.comparingInt(n -> n.value));
        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < lists.size(); i++) {
            if (!lists.get(i).isEmpty()) {
                heap.add(new Node(lists.get(i).get(0), i, 0));
            }
        }


        while (!heap.isEmpty()) {
            Node atual = heap.poll();
            result.add(atual.value);


            int prox = atual.elementIndex + 1;
            if (prox < lists.get(atual.listIndex).size()) {
                heap.add(new Node(lists.get(atual.listIndex).get(prox), atual.listIndex, prox));
            }
        }


        return result;
    }
}