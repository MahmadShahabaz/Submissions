/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    // another appoach is take first one list node and compare with each node of another list node if it == then return that node ;;


    // this is one based on first take the size of the each list , skipp extra node make it eqaual comparesion :)
    public int getSize(ListNode head){
        int count=0;
        ListNode temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }return count;
    } 
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=getSize(headA);
        int sizeB=getSize(headB);

        while(sizeA > sizeB){
            headA=headA.next;
            sizeA--;
        }
        while(sizeB > sizeA){
            headB=headB.next;
            sizeB--;
        }
        while (headA != headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    
}