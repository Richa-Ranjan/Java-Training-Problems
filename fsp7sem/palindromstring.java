class palindromstring {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;   // ✅ Move inward only after matching
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        palindromstring obj = new palindromstring();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(s1 + " → " + obj.isPalindrome(s1));  // true
        System.out.println(s2 + " → " + obj.isPalindrome(s2));  // false
        System.out.println(s3 + " → " + obj.isPalindrome(s3));  // true
    }
}
