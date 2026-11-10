// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode temp = head;
//         ListNode temp2 = head.next;
//         ListNode prev=head;
//         // prev
//         while(temp!=null){
//             while(temp2!=null){
//                 if(temp.val==temp2.val){
//                 prev=temp2.next;
//                 prev=prev.next;
//                 temp2=temp2.next;
//                 }
//             }
//             temp=temp.next;
         

//         }
//         return temp.next;
        
//     }
// }
class Solution {
    public ListNode deleteDuplicates(ListNode head){
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next= temp.next.next;
            }else{
                temp=temp.next;
            }
        } 
        return head;
    }
}