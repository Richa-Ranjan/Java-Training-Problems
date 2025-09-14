import java.util.ArrayList;
import java.util.List;

class arrsubsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<>(); // MD list
        List<Integer> current = new ArrayList<>();           // SD list
        getAllSubsets(nums, current, 0, allSubsets);
        return allSubsets;
    }

    private void getAllSubsets(int[] nums, List<Integer> current, int i, List<List<Integer>> allSubsets) {
        if (i == nums.length) {
            allSubsets.add(new ArrayList<>(current)); 
            return;
        }

        current.add(nums[i]);
        getAllSubsets(nums, current, i + 1, allSubsets);

        current.remove(current.size() - 1);
        getAllSubsets(nums, current, i + 1, allSubsets);
    }

    public static void main(String[] args) {
        arrsubsets obj = new arrsubsets(); // class name fixed
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = obj.subsets(nums);

        System.out.println("All subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
