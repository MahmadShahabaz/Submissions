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
    public ListNode merge(ListNode l1, ListNode l2){
        // ListNode result = new ListNode();
        // while ( l1!=null && l2 !=null){
        if(l1==null) return l2;
        if(l2==null) return l1;



            if (l1.val<=l2.val){
            ListNode res = l1;
            l1.next = merge(l1.next, l2);
            return res;
            }
            else { ListNode res = l2;
            l2.next = merge(l1, l2.next);
            return res;  
            }

    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for(ListNode list:lists){
            res=merge(res, list);
        }
        return res;
        
    }
}