public class SortParity {
    public SortParity() {
        System.out.println("Sorting arrays so that the first half is composed of even numbers and second half is the odd");
    }
    public int[] sortArrayByParity(int[] nums) {

        for(int i = 0, j = 0; j < nums.length; j++) {
            //if it is even put it at the front
            if(nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }

        }
        for(int n : nums) {
            System.out.print(n + " ");
        }
        return nums;
    }
}
