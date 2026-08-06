class Solution {
    public int missingNumber(int[] nums) {
       int allXOR =0;
        for(int i=0;i<=nums.length;i++){
            allXOR = allXOR ^ i;
        }
        for(int number: nums){
            allXOR = allXOR ^ number;
        }
        return allXOR;
    }
}