class Solution {
    public char repeatedCharacter(String s) {
        // create a hashset to hold characters since we we cant have duplicates
        //if a duplicate is seen we can return that duplicate
        
        HashSet<Character> set = new HashSet<>();
        
        for( int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( set.contains(c)){
                return c;
            }
            set.add(c);
        }
        return ' ';
    }
}