class twosumsorted {
    static int[] twoSumSorted(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right}; // return indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{}; // return empty array if no pair found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9};
        int target = 10;

        int[] result = twoSumSorted(arr, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}
