// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int n= nums.length;
//         Arrays.sort(nums);
//         int k =1;
//         // int [] kt = new int[n];
//         List<Integer> kt = new ArrayList<>();
//         for(int i=0; i<n; i++){
//             if (nums[i]!=k){
//                 kt.add(k);
//                 // kt[i]=nums[i];


//                 k++;
//             }
//         }
//         return kt;


//     }
// }


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        boolean [] seen = new boolean[n+1];
        List<Integer> kt = new ArrayList<>();

        for(int i=0; i<n; i++){
            seen[nums[i]]=true;

        }
        for (int i =1; i<=n; i++){
            if (!seen[i]){
            kt.add(i);
            }
            
        }return kt;
    }  
}