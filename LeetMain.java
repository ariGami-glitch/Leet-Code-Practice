public class LeetMain {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 4, 2, 1, 3};
        HeightCheck hc = new HeightCheck();
        int ab = hc.heightChecker(arr);
        System.out.println(ab);
    }
}
