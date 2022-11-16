class Solution {
    public boolean isPalindrome(String s) {
        // In order to see if the left character is equal to the right character then we will 
        // need to have two pointers to compare them and determine if it is a valid palindrome
        // we will use a while loop to execute this string as well
        
        for( int i =0, j = s.length()-1; i<j; i++, j--){
            while( i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while( i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
        }
        return true;
        }

    }
