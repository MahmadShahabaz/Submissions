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
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode res1 = new ListNode(-1);
//         ListNode res=res1;
//         // int sum =0;
        
//         while(l1 != null || carry !=0){
//             int v = 0, v2=0;
//             if(l1!=null){
//                 v = l1.val;
//                 l1=l1.next;
            
//             }
//             if(l2!=null){
//              v2 = l2.val;
//              l2=l2.next;

//             }
//             int sum = v + v2;

//             carry = sum / 10;

//             res1.next = new ListNode(sum % 10);

//             res1 = res1.next;

            
            
//             // sum = v+v2;

//             // res.val=(sum);
            
//             // res=res.next;
//         }
//         return res.next;
        
//     }
// }


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(-1);
        ListNode temp = res;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {

            int v = 0, v2 = 0;

            if(l1 != null) {
                v = l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }

            int sum = v + v2 + carry;

            carry = sum / 10;

            temp.next = new ListNode(sum % 10);

            temp = temp.next;
        }

        return res.next;
    }
}


