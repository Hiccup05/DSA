public class Palindrome {
    public boolean isPalindrome(String x) {
        String reverse;
        String[] array=new String[x.length()];
        for(int i=0;i<x.length();i++){
            array[i]=Character.toString(x.charAt(x.length()-i-1));
        }
        reverse=String.join("", array);
        System.out.println(reverse);
        return reverse.equals(x);
    }
    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        System.out.println(p.isPalindrome("madam"));
    }
}
