class ReverseInteger {
    public int reverse(int A) {
        int rev = 0;
        while (A != 0) {
            int d = A % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
            rev = rev * 10 + d;
            A = A / 10;
        }
        return rev;
    }
}
