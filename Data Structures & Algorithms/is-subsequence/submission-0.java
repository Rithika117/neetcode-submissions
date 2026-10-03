class Solution {
    public boolean isSubsequence(String s, String t) {
        int n= s.length();
        int m=t.length();
        int pos=0;
        for(int k=0;k<n;k++){
             boolean found=false;
            for(int l=pos;l<m;l++){
                if (s.charAt(k) == t.charAt(l)) {
                    pos=l+1;
                    found=true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }return true;    
    }
}