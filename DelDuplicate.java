public class DelDuplicate {
    public DelDuplicate() {
        System.out.println("This object aims to delete the duplicates in arrays.");
    }
    public int removeDuplicates(int[] nums) {

        int length = nums.length;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[length - 1];
                nums[length - 1] = temp;
                length--;

            }
        }
        return length;
    }

    public int efficient(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
