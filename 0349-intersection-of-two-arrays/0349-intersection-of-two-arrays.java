// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int m = nums2.length;
//         int[] ans=new int[n];
//         for (int i = 0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if (nums1[i]==nums2[j]){
//                     for (int k = 0; k<ans.length; k++){
//                         if (ans[k]!=nums1[i]){
//                             ans[k]=nums1[i];
//                             k++;
//                             break;
//                         }

//                     }
                    

//                 }
//             }
//         } return ans;
    
        
//     }
// }


import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }

        int[] result = new int[ans.size()];
        int k = 0;

        for (int num : ans) {
            result[k] = num;
            k++;
        }

        return result;
    }
}
