class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(x==0) return 0.0;
        if(x==1) return 1.0;
        if(x==-1 && N%2==0) return 1.0;
        if(x==-1 && N%2!=0) return -1.0;
        if(N==0) return 1.0;
        if(N<0){
            x=1/x;
            N= -N;
        }
        double ans=1;

        while(N>0){
            if(N%2==1){
                ans= ans*x;
            }
            x=x*x;
            N=N/2;
    }
    return ans;
    }
}