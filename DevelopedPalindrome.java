public class DevelopedPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int start=0; int end = chars.length-1;
        while(start < end) {
            if(chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        DevelopedPalindrome dp = new DevelopedPalindrome();
        System.out.println(dp.isPalindrome("madam"));
    }
}
