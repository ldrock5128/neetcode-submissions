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
    public ListNode reverseList(ListNode head) {
        /*
            1. Iterate through list 
            2. At each node set the next node equal to the one before it
                1. Set head to curr
                2. Set prev to curr
                3. Move curr to next node
                4. Set curr.next to temp
        */

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;          
        }

        return prev; 
    }
}
