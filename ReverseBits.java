class ReverseBits {
    public long reverse(long a) {
        long rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = rev << 1;
            if ((a & (1 << i)) != 0)
                rev = rev | 1;
        }
        return rev;
    }
}
