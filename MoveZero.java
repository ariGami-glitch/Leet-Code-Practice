public class MoveZero {
    public MoveZero() {
        System.out.println("Given an array, move all the zeros to the end");
    }
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0;
        int z = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] == 0) {
                z++;
            }
            if(nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for(int j = nums.length; j > nums.length - z; j--) {
            nums[j - 1] = 0;
        }

        for(int n : nums) {
            System.out.print(n + " ");
        }

    }

    public void efficient(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int tmp = nums[j];
                nums[j] =  nums[i];
                nums[i] = tmp;
                i++;

            }
        }
        for(int n : nums) {
            System.out.print(n + " ");
        }

    }
}
