class Solution {
    public boolean isHappy(int n) {
        if(n<=0){
            return false;
        }
        while(n!=1 &&n!=4){
            int sum=0;
            while(n>0){
                int digit =n%10;
              sum+=Math.pow(digit,2);  // sum+=digit*digit;
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
}