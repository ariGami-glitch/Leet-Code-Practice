import java.util.Arrays;
public class HeightCheck {
    public HeightCheck() {
        System.out.println("Making sure it is in the correct increasing order");
    }
    public int heightChecker(int[] heights) {
        int n = 0;
        //save the array and sort it
        int[] arr = new int[heights.length];
        for(int k = 0; k < arr.length; k++) {
            arr[k] = heights[k];

        }
        Arrays.sort(arr);
        for(int i = 0; i < heights.length; i++) {
            if(arr[i] != heights[i]) {
                n++;
            }
        }
        return n;
    }

}
