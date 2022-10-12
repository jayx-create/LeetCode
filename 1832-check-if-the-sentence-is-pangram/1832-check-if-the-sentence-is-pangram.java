class Solution {
    public boolean checkIfPangram(String sentence) {
       //declare a hashset for unique characters
        
        HashSet<Character> set = new HashSet<>();
        
        // have c represent 'i' for sentence 
        for( char c : sentence.toCharArray()){
            // add if not in set
            set.add(c);
        }
        //return the size of the hashset == to 26 for the alphabet
        return set.size() == 26;
    }
}