
class Solution {
    public String getSmallestString(int n, int k) {
        int kk = k - n;
        StringBuilder s = new StringBuilder();

        for(int i = n-1; i >= 0; i--) {
            if(kk >= 25) {
                s.append('z');
                kk = kk - 25;
            } else {
                s.append((char)('a' + kk));
                kk = 0;
            }
        }

        return s.reverse().toString();
    }
}
