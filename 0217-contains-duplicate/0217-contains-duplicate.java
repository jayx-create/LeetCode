class Solution {
    public boolean containsDuplicate(int[] nums) {
        // We will use a hashset to store the Integers
        // when we hit an Integer that we have seen we will program true
        //if we have not see the number we will add it into the hashset to store
        //else if no duplciate in the hashmap we will program false;
        HashSet<Integer> set = new HashSet<>();
        for( int i = 0; i < nums.length; i++){
            if( set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}