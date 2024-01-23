public class ThirdMax {
    public ThirdMax() {
        System.out.println("Given an array, determine the third maximum value, if there is not a third max, just return the max");

    }
    public int thirdMax(int[] nums) {
        int max = nums[0];
        if(nums.length < 3) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > max) {
                    max = nums[i];
                }
            }
            return max;
        }
        else {
            int max1;
            int max2;
            int max3;
            //find the first max and remove it
            //find the second max and remove it
            //find the third max return it
            return max;
        }



    }
}
