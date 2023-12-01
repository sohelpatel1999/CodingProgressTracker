public class palindromerecursion {

    static boolean palindrome(char[] ch, int start, int end) {

        if (start == end || start > end) {
            return true;
        }

        if (ch[start] == ch[end]) {

            boolean temp = palindrome(ch, start + 1, end - 1);
            return temp;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        char[] ch = { 'a', 's', 's', 'f', 'd', 's', 'a' };
        boolean answer = palindrome(ch, 0, ch.length - 1);
        System.out.println(answer);

    }

}
