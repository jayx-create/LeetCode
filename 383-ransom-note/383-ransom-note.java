class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // have an array of 26 characters.
        // add all characters of magazine first, then decrement characters from ransomNote
        // and if all characters are gone in the array after then true else false;
        
        int [] counter = new int [26];
        
        for( char c : magazine.toCharArray()){
            counter[ c - 'a']++;
        }
        for( char c : ransomNote.toCharArray()){
            if( counter [ c - 'a'] <= 0) return false;
            counter[ c - 'a']--;
        }
        return true;
    }
}