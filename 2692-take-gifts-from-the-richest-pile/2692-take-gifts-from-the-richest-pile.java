class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int g:gifts) pq.add(g);
        for(int i=0; i<k; i++){
           pq.add((int)Math.floor(Math.sqrt(pq.remove())));
        }
       long sum =0;
       while(!pq.isEmpty()){
        sum+=pq.remove();
       } 
       return sum;
    }
}