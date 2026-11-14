class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        Stack<Integer> st = new Stack<>();

        for(int i = nums.length - 1; i >= 0;) {

            if(st.size() == 3) {
                return st.pop();
            }

            if(st.isEmpty()) {
                st.push(nums[i]);
                i--;
            }
            else if(st.peek() != nums[i]) {
                st.push(nums[i]);
                i--;
            }
            else {
                
                i--;
            }
        }

        if(st.size() == 3) {
            return st.pop();
        }

        return st.get(0);
    }
}