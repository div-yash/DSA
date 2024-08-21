https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            }
            else{
                map1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);

            }
            else{
                map2.put(t.charAt(i),1);
            }
        }
        for(char ch: map1.keySet()){
            if(!map1.get(ch).equals(map2.get(ch))){
                return false;
            }
        }
        return true;
    }
}
