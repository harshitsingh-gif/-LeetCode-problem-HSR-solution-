class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
       int previ1= 1;
       int previ2= 2;
       int current=0;
       for(int i=3;i<=n;i++){
current= previ1+ previ2;
previ1 =previ2;
previ2 =current;
       }
       return previ2;
    }
}