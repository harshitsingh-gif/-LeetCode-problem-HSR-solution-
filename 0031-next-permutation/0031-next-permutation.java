class Solution {
    private void reverse(int[] nums, int start, int end){
         int left=start,right=end;
            while(left<right){
              int temp= nums[left];
                nums[left]= nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
    }
    public void nextPermutation(int[] nums) {
        int pivot= -1, n= nums.length;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot ==-1){
         reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[pivot]<nums[i]){
                int temp= nums[pivot];
                nums[pivot] = nums[i];
                nums[i]= temp;
                break;
            }
        }

        reverse(nums,pivot+1,n-1);

    }
}