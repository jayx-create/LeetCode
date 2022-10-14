class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if( s == null || s.length() == 0 || s.length() < k)
        return s.length();
        
        int start = 0;
        int max = 0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for( int end = 0; end < s.length(); end++ ){
            char last = s.charAt(end);
            map.put(last, map.getOrDefault(last, 0) + 1);
            
            
            while( map.size() > k){
                char first = s.charAt(start);
                map.put(first, map.get(first) - 1);
                if( map.get(first) == 0){
                    map.remove(first);
                }
                start++;
            }
            max= Math.max(max, end - start + 1);
        }
        return max;
    }
}