/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum_val = carry;
            if (l1 != null) {
                sum_val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum_val += l2.val;
                l2 = l2.next;
            }
            carry = sum_val / 10;
            current.next = new ListNode(sum_val % 10);
            current = current.next;
        }
        return dummy.next;
    }
}