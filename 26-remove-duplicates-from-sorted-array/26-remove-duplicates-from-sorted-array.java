class Solution {
    public int removeDuplicates(int[] nums) {
        // slow and fast pointers ot keep track of duplicated. when the two pointers are not
        //matching increase slow and then make slow equal to fast
        int slow = 0;
        for ( int fast = 0; fast < nums.length; fast ++){
            if( nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}