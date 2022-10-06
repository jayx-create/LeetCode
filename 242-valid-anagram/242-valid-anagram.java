class Solution {
    public boolean isAnagram(String s, String t) {
        // We can use an array to hold character values 
        // we will insert the characters into the array then we will decrement as well 
        // this will result in true if all characters are present
        if( s.length() != t.length()){
            return false;
        }
        
        int [] counter = new int [26];
        
        for( char c : s.toCharArray()){
            counter [ c - 'a']++;
        }
        
        for( char c : t.toCharArray()){
            if( counter [ c - 'a'] <= 0) return false;
            counter[ c - 'a']--;
        }
        return true;
    }
}