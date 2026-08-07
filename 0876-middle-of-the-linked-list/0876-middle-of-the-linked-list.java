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
    public ListNode middleNode(ListNode head) {
    int count =0;
ListNode end = head;
ListNode start = head;

while(end!=null){
    count ++;
    end =end.next;
}
 int middle = count /2;

 for(int i =0; i < middle ;i++){
       start = start.next;
 }
  return start ;
    }
}