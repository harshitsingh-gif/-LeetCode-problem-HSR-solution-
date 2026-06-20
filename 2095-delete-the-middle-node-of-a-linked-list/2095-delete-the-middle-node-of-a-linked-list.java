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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        int prevNodeIdx = size/2-1;
        ListNode currNode = head;
        for(int i =0; i<prevNodeIdx;i++){
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;

        return head;
    }
}