class LongestSubString{
public static String longestSubString(String s){
 if(s.length()==0 || s.length()==1) return s;
        int n = s.length();
        String result ="";
        for(int i=0;i<n;i++){
            int start = i; 
            int finish = i;
            String temp="";
            while(start>=0 && finish<n && s.charAt(start)==s.charAt(finish)){
                start--;
                finish++;
            }
            temp = s.substring(start+1, finish);
            result = temp.length()>result.length()?temp:result;
            int begin =i;
            int end =i+1;
            while(begin>=0 && end<n && s.charAt(begin)==s.charAt(end)){
                begin--;
                end++;
            }
            temp = s.substring(begin+1, end);
            result = temp.length()>result.length()?temp:result;
            
        }
        return result;
}
public static void main(String[] args){
	System.out.println(longestSubString("BABABABACDASV"));
}
}

 