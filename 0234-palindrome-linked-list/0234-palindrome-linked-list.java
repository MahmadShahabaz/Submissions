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
//     // public ListNode tail(ListNode h){

//     // }
//     public boolean isPalindrome(ListNode head) {
//         ListNode temp = head;
//         ListNode tail ;
//         Stack <ListNode> stk = new Stack<>();
//         while(temp!=null){
//             stk.push(temp);
//             temp=temp.next;
            

        
//         }
//         tail = stk.peek();
//         ListNode tempp=head;

//         while(tempp != null){
//             tail=stk.pop();
//             if (tempp != tail)
//             return false;
//             // else{} return false;

//             tempp = tempp.next;
            
//         } 
//         return true;


        
//     }
// }

class Solution{
     public boolean isPalindrome(ListNode head){
        Stack<ListNode> stk = new Stack<>();

        for (ListNode curr = head; curr!=null; curr=curr.next){
            stk.push(curr);
        }
        ListNode left=head; 
        ListNode right=stk.peek();
        while(stk.size()>0){
            right= stk.pop();
            if (left.val != right.val)
            return false;
            left=left.next;

        }
        return true;
    }
}