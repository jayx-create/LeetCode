class Solution {
    public int search(int[] nums, int target) {
        // We will use binary search just to find the target. We will initialize two variables 
        // left and right then we will initialize another variable for mid to find the target
        // when it comes to binary search we will use a while loop to keep the 
        // binary search going
        int left = 0;
        int right = nums.length - 1;
        while( left <= right){
            int mid = left  + ( right - left) / 2;
            if( nums[mid] == target ) return mid;
            else if( nums[mid] > target ) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}