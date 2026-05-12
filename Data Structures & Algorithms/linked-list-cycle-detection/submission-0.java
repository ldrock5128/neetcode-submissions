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
    public boolean hasCycle(ListNode head) {
        /*
            1. Iterate through list
            2. Store each node in a hashtable
            3. If the node is in the hash table return true
        */

        ListNode curr = head;
        HashMap<ListNode, Integer> nodes = new HashMap<>();

        while(curr != null){
            if(nodes.containsKey(curr)){
                return true;
            }
            nodes.put(curr, 0);
            curr = curr.next;
        }
        return false;
    }
}
