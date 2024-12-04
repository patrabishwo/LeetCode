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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //calculating the size
        int sz =0;
        ListNode temp = head;
        while(temp != null){
            temp= temp.next;
            sz++;
        }

        if(n == sz){
            head =head.next;
        }

        //sz -n
        int i=0;
        int idxToFind = sz -n;
        ListNode prev = dummy;
        while( i < idxToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return dummy.next;

    }
}