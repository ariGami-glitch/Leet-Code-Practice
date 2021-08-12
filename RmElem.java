public class RmElem {
    public RmElem() {
        System.out.println("Given the value, remove all the instances of that value");
    }
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for(int i = 0, j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                //int temp = nums[i];
                nums[i] = nums[j];
                //nums[j] = temp;
                i++;

            }
            else {
                n--;
            }
        }
        for(int k : nums) {
            System.out.println(k + " ");
        }
        System.out.println(n);
        return n;
    }
}
