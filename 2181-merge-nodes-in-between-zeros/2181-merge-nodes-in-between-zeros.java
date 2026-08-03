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
    public ListNode mergeNodes(ListNode head) {
        ListNode modify = head;
        ListNode current = head;
        while(current != null){
            int sum =0;
            while(current.val != 0){
                sum+=current.val;
                current = current.next;
            }
            modify.val= sum;

            current = current.next;

            modify.next = current;
            modify = modify.next;
        }
        return head.next;
    }
}