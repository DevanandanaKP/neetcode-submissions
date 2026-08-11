class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hash=new HashMap<>();
        List<List<String>> result=new ArrayList<>();
        for(String word:strs)
        {
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(hash.containsKey(key))
            {
                hash.get(key).add(word);
            }
            else
            {
                hash.put(key,new ArrayList<>());
                hash.get(key).add(word);
            }

        }    
        result=new ArrayList<>(hash.values()); 
        return result;   
    }
}
