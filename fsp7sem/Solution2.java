public class Solution2 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r) {
            int lh = height[l];
            int rh = height[r];
            int min_h = Math.min(lh, rh);
            int width = r - l;
            int area = min_h * width;

            max = Math.max(max, area);

            if (lh < rh) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};
        int[] height3 = {4, 3, 2, 1, 4};
        
        int result1 = solution.maxArea(height1);
        int result2 = solution.maxArea(height2);
        int result3 = solution.maxArea(height3);
        
        System.out.println("Max Area for height1: " + result1);
        System.out.println("Max Area for height2: " + result2);
        System.out.println("Max Area for height3: " + result3);
    }
} {
    
}
