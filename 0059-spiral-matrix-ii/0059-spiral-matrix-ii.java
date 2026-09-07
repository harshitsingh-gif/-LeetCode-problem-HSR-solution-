class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int top =0,bottom = n-1,left = 0,right = n-1,num =1;
        while(top<= bottom && left<= right){
            for(int i=left;i<=right;i++){
                result[top][i] = num++; 
            }
            top++;
            
            for(int j= top;j<=bottom;j++ ){
                result[j][right] = num++;
            }
            right--;
            if(top<=bottom){
            for(int i =right;i>=left;i--){
                result[bottom][i] = num++;
            }
            bottom--;
            }
            if(left<=right){
            for(int j =bottom;j>=top;j-- ){
                result[j][left] = num++;
            }
            left++;
            }
        }
        return result;
    }
}