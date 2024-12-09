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
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify code
        ListNode current = dummyHead; // Pointer to build the result list
        int carry = 0; // Initialize carry as 0
        
        // Traverse both lists until both are null
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            
            // Add l1's value if l1 is not null
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move to the next node in l1
            }
            
            // Add l2's value if l2 is not null
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to the next node in l2
            }
            
            // Calculate the digit (sum mod 10) and the carry (sum / 10)
            carry = sum / 10;
            current.next = new ListNode(sum % 10); // Create a new node for the current digit
            current = current.next; // Move the pointer to the newly added node
        }
        
        // Return the result list starting from the node after dummyHead
        return dummyHead.next;
    }
}
