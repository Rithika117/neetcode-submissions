class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i=0;
        int j=0;
        StringBuilder res=new StringBuilder();
        while(i<w1.length()&&j<w2.length()){
            res.append(w1.charAt(i));
            res.append(w2.charAt(j));
            i++;
            j++;
        }
        while(i<w1.length()){
            res.append(w1.charAt(i));
            i++;
        }
        while(j<w2.length()){
            res.append(w2.charAt(j));
            j++;
        }
       return res.toString();

    }
}