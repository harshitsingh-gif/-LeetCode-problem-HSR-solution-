class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max= Integer.MIN_VALUE;
        for(int num: nums){
            if(min> num){
                min = num;
            }
            if(max<num){
                max= num;
            }
        }
        return gcd(min,max);
    }

            public int gcd(int a, int b){       //by Euclid Algorithm to find greatest common divisor of two numbers
        if(a>b){
            return gcd(b,a);
        }
        if(a==0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }

}
