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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        while(temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        if(stack.isEmpty()) return head.next;
        ListNode prev = stack.peek();
        prev.next = prev.next.next;

        return head;
    }
}