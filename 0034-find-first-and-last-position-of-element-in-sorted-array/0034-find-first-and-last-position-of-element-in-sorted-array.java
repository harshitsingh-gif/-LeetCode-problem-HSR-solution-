class Solution {
    public int[] searchRange(int[] nums, int target) {
        int Left = findLeftBound(nums, target);
        int Right = findRightBound(nums, target);
         return new int[] {Left, Right};
    }
// for findinf left most occurence of target as index below function
    private int findLeftBound(int[] nums, int target){
        int index = -1, low =0,high =nums.length-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(nums[mid]==target){
                index = mid;
                high = mid -1;
            }
            else if (nums[mid]<target){
                low = mid+1;
            }
            else{
                high =mid-1;
            }
        }
            return index;
        }
  
  // for findinf right most occurence of target as index below function
      private int findRightBound(int[] nums, int target){
        int index = -1, low =0,high =nums.length-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(nums[mid]==target){
                index = mid;
                low = mid+1;
            }
            else if (nums[mid]<target){
                low = mid+1;
            }
            else{
                high =mid-1;
            }
        }
            return index;
        }
      
}