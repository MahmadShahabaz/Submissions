class Solution {

    // approach 1 , time = nlogk
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i<nums.length; i++){
            pq.add(nums[i]);


            if (pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}

//  approach 2 with time: nlogn 
/*
public int findKthLargest(int[] nums, int k) {
Arrays.sort(nums);
int n = nums.length;
return nums[n-k];
}
*/