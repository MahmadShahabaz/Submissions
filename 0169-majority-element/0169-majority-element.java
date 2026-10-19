// class Solution {
//     public static int getC(int nums[], int left, int right, int target){
//             int count =0;
//             for (int i = left ; i<= right; i++){
//             if(nums[i]==target){
//             count++;
//          }
//      }
//      return count;
//     }
    



//     public int majorityElement(int[] nums, int left, int right) {
//         if (right==left) return nums[left];
//         int mid = left+(right-left)/2;
//         int ansA = majorityElement(nums, left, mid);
//         int ansB = majorityElement(nums, mid+1, right);
//         int countA=getC(nums, left, ansA);
//         int countB=getC(nums, mid+1, ansb);
        
//         if (countA>countB)
//         return ansA;
//         else return ansB;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}