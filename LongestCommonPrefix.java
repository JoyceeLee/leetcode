// Write a function to find the longest common prefix string amongst an array of strings.


public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) {
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        for(int i=0; i<strs[0].length();i++) {
            char c = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++) {
                if(strs[j].length()==i || strs[j].charAt(i)!=c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
