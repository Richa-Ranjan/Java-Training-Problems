public class removeduplicate {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3};
        int[] nums3 = {1, 2, 3, 4, 5, 6};

        int length1 = solution.removeDuplicates(nums1);
        System.out.print("Array after removing duplicates for nums1: ");
        for (int i = 0; i < length1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int length2 = solution.removeDuplicates(nums2);
        System.out.print("Array after removing duplicates for nums2: ");
        for (int i = 0; i < length2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        int length3 = solution.removeDuplicates(nums3);
        System.out.print("Array after removing duplicates for nums3: ");
        for (int i = 0; i < length3; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println();
    }
}

class Solution3 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
