/*
  Write a function to find the longest common prefix string amongst an array of strings.

  If there is no common prefix, return an empty string "".
  
  Answer by Mohammad Pasha Khoshkebari. 
*/

/*
  Possible Improvements: 
  
  * Compare characters instead of strings. 
  * Make if statements one if statement. 
  * Use indexOf instead of current system. 
*/

class Solution {
    public static String longestCommonPrefix(String[] strs) {

	        String first = strs[0]; // "Flower"
	        
	        for (int a = 1; a <= first.length(); a++) {
	        	String substring = first.substring(0,a); //"F"
	        	
	        	for (int b = 1; b < strs.length; b++) {
	        		if (strs[b].length() < a) {
	        			
	        			return first.substring(0, (a-1));
	        		}
	        		
	        		String substringExample = strs[b].substring(0,a); //"F"
	        		
	        		if (!substring.equals(substringExample)) {
	        			
	        			return first.substring(0, (a-1));
	        		}
	        	}
	        }
	        return first;
	  }
}



