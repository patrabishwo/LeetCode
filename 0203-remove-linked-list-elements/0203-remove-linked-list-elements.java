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
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to handle edge cases where the head needs to be removed
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode current = dummy;

        // Traverse the list and remove nodes with the given value
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node with the target value
            } else {
                current = current.next; // Move to the next node
            }
        }

        return dummy.next; // Return the new head
    }
}
