public class LeetMain {
    public static void main(String[] args) {
        int[] arr = new int[]{17, 18, 1};
        GreatestReplace gr = new GreatestReplace();
        arr = gr.efficient(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
