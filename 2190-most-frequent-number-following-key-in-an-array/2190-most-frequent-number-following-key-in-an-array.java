class Solution {
    public int mostFrequent(int[] nums, int key) {
        int [] count = new int [1001];
        for(int i =1; i<nums.length; i++){
            if (nums[i-1]==key){
                count[nums[i]]++;
            }
        }
        int max=0;
        for (int i =0; i<count.length; i++){
            if (count[i]>count[max]){
                max=i;
            }
        } return max;
        
    }
}