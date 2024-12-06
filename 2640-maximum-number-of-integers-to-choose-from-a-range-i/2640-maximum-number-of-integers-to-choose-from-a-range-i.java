class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
       HashSet<Integer> exclude= new HashSet<>();
       for(int i:banned) exclude.add(i);
       int select =0;
       for(int i=1; i<=n; i++){
        if(!exclude.contains(i) && i<=maxSum){
            select +=1;
            maxSum-=i;
        }else if(i > maxSum)break;
       } 
       return select;
    }
}