class Palindrome {
    
    //checks if string is empty, if it is then its a palindrome
    public boolean isPalindrome(String str) {
        if( str == null || str.length() == 0){
            return true;
        }
        
        //string gets put into an array
        //i = beginning of array
        //j = end of array
        char [] a = str.toCharArray();
        int i = 0;
        int j = a.length-1;
        
        
        while(i < j){
        
        //loop that allows i to go from the first letter to the last and ignores anything thats not a letter or digit by moving i++
        while(i < a.length && !Character.isLetterOrDigit(a[i])){
            i++;
        }
        
        //loop that allows j to go from the last letter to the first and ignores anything thats not a letter or digit by going to the next character
        while(j >= 0 && !Character.isLetterOrDigit(a[j])){
            j--;
        }
        
        //compares if characters are not the same 
        if( i < a.length && j >= 0 && Character.toLowerCase(a[i]) != Character.toLowerCase(a[j])){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
}
