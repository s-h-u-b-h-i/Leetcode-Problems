class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)){
            ArrayList<Character> ch=new ArrayList<>();
            for(char i:s.toCharArray()){
                if(ch.contains(i)) return true;
                else ch.add(i);
            }
        }
        else{
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=goal.charAt(i)) 
                    list.add(i);
            }
            return list.size()==2 && s.charAt(list.get(0))==goal.charAt(list.get(1)) && s.charAt(list.get(1))==goal.charAt(list.get(0));
        }
        return false;
    }
}