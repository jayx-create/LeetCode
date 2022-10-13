class Solution {
    public int findDuplicate(int[] nums) {
        // initiate a hashset
        HashSet<Integer> set = new HashSet<>();
        //have the variable num intake the values in nums
        for( int num : nums){
            //if num is in the hashset return that value
            if( set.contains(num))
                return num;
            
            //if not seen add it in the set
                set.add(num);
            
            
        }
        return -1;
    }
}