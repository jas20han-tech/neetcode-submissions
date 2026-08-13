class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(char x : t.toCharArray()){
            if(map.containsKey(x)){
                map.put(x,map.get(x)-1);

                if(map.get(x)==0){
                    map.remove(x);
                }
            }
        }
        return map.isEmpty();
    }
}
