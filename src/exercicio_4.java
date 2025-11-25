// =========================
// Exercicio: Verificação de Propriedade de Min-Heap
// =========================
public class exercicio_4 {
    public static boolean isMinHeap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;


            if (left < arr.length && arr[i] > arr[left]) return false;
            if (right < arr.length && arr[i] > arr[right]) return false;
        }
        return true;
    }
}