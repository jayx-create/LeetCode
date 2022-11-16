/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // We will use the tortise and the hare algorithm which will help us
        // determine if it is a cycle. We will have a slow and fast pointer 
        // which will evenetually result in the fast pointer meeting with the slow pointer if
        // it is a cycle
        
        ListNode slow = head;
        ListNode fast = head;
        while( fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
            if( fast == slow ) return true;
        }
        return false;
    }
}