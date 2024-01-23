package heaps;

public class Heaps {
    public static void main(String[] arg) {
        System.out.println();
        MinIntHeap mheap = new MinIntHeap(7);

        mheap.insert(4);
        mheap.insert(3);
        mheap.printHeap();
        mheap.insert(2);
        mheap.printHeap();
        mheap.insert(0);
        mheap.printHeap();
        mheap.insert(13);
        mheap.insert(9);
        mheap.insert(1);
        mheap.printHeap();
        System.out.println();
        mheap.minHeap();
        mheap.printHeap();

    }
}
