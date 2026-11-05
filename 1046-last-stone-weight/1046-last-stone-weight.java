class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> mpq= new PriorityQueue<>(Collections.reverseOrder());
           
            for(int i=0; i<stones.length; i++){
                mpq.add(stones[i]);
            }

            while(mpq.size()>1){

                int m =mpq.poll();
                int n = mpq.poll();
                

                int finalN= m-n;
                if (finalN != 0){
                    mpq.add(finalN);

                }

                

                // return 0;

            }
            if (mpq.size()>0){
                    return mpq.peek();

                }
                return 0;

            
            

    //    return 0; 
        
    } 
}