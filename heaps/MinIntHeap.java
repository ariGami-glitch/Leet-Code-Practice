public class MinIntHeap {
    private int[] heap;
    private int size;
    private int index;

    public MinIntHeap(int size) {
        this.size = 0;
        this.index = 0;

        heap = new int[this.size];
    }
    private int parent(int i) {
        return (i - 1) / 2;
    }
    private int leftChild(int i) {
        return (i * 2) + 1;
    }
    private int rightChild(int i) {
        return (i * 2) + 2;
    }
    private boolean isLeaf(int i) {
        if (rightChild(i) >= size || leftChild(i) >= size) {
            return true;
        }
        return false;
    }
    public void insert(int element) {
        if (index >= size) {
            return;
        }
        heap[index] = element;
        int current = index;

        while(heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        index++;
    }
    public int remove() {
        int popped = heap[0];
        heap[0] = heap[--index];
        minHeapify(0);
        return popped;
    }
    private void minHeapify(int i) {
        if(!isLeaf(i)) {
            if(heap[i] > heap[leftChild(i)] || heap[i] > heap[rightChild(i)]) {
                if (heap[leftChild(i)] > heap[rightChild(i)]) {
                    swap(i, leftChild(i));
                    minHeapify(leftChild(i));
                }
                else {
                    swap(i, rightChild(i));
                    minHeapify(rightChild(i));
                }
            }
        }
    }
    public void minHeap() {
        for(int i = (index - 1 / 2); i >=1; i--) {
            minHeapify(i);
        }
    }
    public void printHeap() {
        for (int i = 0; i < (index / 2); i++) {
            System.out.println("Parent : " + heap[i]);
            if (leftChild(i) < index) {
                System.out.println(" Left : " + heap[leftChild(i)]);
            }
            if (rightChild(i) < index) {
                System.out.println(" Right : " + heap[rightChild(i)]);
            }
            System.out.println();
        }
    }
    private void swap(int x, int y) {
        int tmp;
        tmp = heap[x];
        heap[x] = heap[y];
        heap[y] = tmp;
    }
}