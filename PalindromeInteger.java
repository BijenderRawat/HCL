class PalindromeInteger {
    public int isPalindrome(int A) {
        int rev = 0;
        int temp = A;
        while (A > 0) {
            rev = (rev * 10) + A % 10;
            A = A / 10;
        }
        if (rev == temp)
            return 1;
        return 0;
    }
}
