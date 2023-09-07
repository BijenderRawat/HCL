class ReverseNthNodeFromListEnd {
    public int length(ListNode A) {
        int length = 0;
        while (A != null) {
            length++;
            A = A.next;
        }
        return length;
    }

    public ListNode removeNthFromEnd(ListNode A, int B) {
        if (A == null)
            return null;
        int length = length(A);
        ListNode head = new ListNode(-1);
        head.next = A;
        ListNode temp = head;
        for (int i = 0; i < length - B; i++)
            temp = temp.next;
        temp.next = temp.next.next;
        return head.next;
    }
}