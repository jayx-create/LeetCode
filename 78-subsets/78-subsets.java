class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset = new ArrayList<>();
        subset.add(new ArrayList<>());
        for ( int currentNum : nums){
            int n = subset.size();
            for( int i =0; i < n; i++){
                List<Integer> set = new ArrayList<>(subset.get(i));
                set.add(currentNum);
                subset.add(set);
            }
        }
        return subset;
    }
}