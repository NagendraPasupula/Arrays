 
 /**
 Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 **/
 
 class LongestPossible{
	
	public int longestPalindrome(String s) {
        Map<Character, Integer> map= new HashMap<>();
		    for(int i=0;i<s.length();i++){
			    if(map.containsKey(s.charAt(i))){
				    map.put(s.charAt(i), map.get(s.charAt(i))+1);
			    }
			    else{
				    map.put(s.charAt(i), 1);
			    }
		    }
		int longest =0;
		int counter=0;
		
		    for(Character c:map.keySet()){
			    if(map.get(c)%2 !=0 ){
			        longest = longest+map.get(c)-1;
			        counter++;
			    }else if(map.get(c)%2==0){
				    longest =longest+map.get(c);
			    }
		    }		    
		    longest = counter>0?longest+1:longest;
		return longest;
    }
	
	public static void main(String[] args){
	
	System.out.println(longestPalindrome("BABABACDACC"));
 
	}
 }
 