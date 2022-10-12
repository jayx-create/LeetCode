class Solution {
    public void reverseString(char[] s) {
        // Use a two pointer teq and keep iterating until they do not cross
        // we will use a temp variable to hold the value of left then have right //intake it
        // we will keep repeating until while loop stops
        
        int left = 0;
        int right = s.length - 1;
        
        while( left < right){
            char temp = s[left];
            s[left++]=s[right];
            s[right--]=temp;
        }
    }
}