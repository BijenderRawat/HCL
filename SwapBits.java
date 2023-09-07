class SwapBits {
    public int solve(int A, int B, int C) {
        int bthbit = A & (1 << (B - 1));
        int cthbit = A & (1 << (C - 1));
        if (cthbit == 0)
            A = A & (~(1 << (B - 1)));
        else
            A = A | (1 << (B - 1));
        if (bthbit == 0)
            A = A & (~(1 << (C - 1)));
        else
            A = A | (1 << (C - 1));
        return A;
    }
}
