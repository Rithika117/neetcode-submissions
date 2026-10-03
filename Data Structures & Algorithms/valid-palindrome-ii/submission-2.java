class Solution{
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                int l=left+1;
                int r=right;
                while (l < r && s.charAt(l) == s.charAt(r)) {
                    l++;
                    r--;
                }if(l>=r){
                    return true;
                }
                int le=left;
                int ri=right-1;
                while(le<ri&&s.charAt(le)==s.charAt(ri)){
                    le++;
                    ri--;
                }return le>=ri;
            }
        }
        return true;

    }
}