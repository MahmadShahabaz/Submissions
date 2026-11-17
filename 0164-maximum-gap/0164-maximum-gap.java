class Solution {
    public int maximumGap(int[] nums) {

        if(nums.length < 2) return 0;

        int min = nums[0];
        int max = nums[0];

        for(int i=0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        if(min == max) return 0;

        int n = nums.length;

        int bucketSize = Math.max(1, (max-min)/(n-1));
        int bucketCount = (max-min)/bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        boolean[] used = new boolean[bucketCount];

        for(int i=0; i<n; i++){

            int index = (nums[i]-min)/bucketSize;

            bucketMin[index] = used[index] ?
                Math.min(bucketMin[index], nums[i]) : nums[i];

            bucketMax[index] = used[index] ?
                Math.max(bucketMax[index], nums[i]) : nums[i];

            used[index] = true;
        }

        int ans = 0;
        int prev = min;

        for(int i=0; i<bucketCount; i++){

            if(!used[i]) continue;

            ans = Math.max(ans, bucketMin[i]-prev);

            prev = bucketMax[i];
        }

        return ans;
    }
}