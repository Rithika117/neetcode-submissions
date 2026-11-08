class Solution {
    public int majorityElement(int[] nums) {
        int ca=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                ca=num;
            }
            if(num==ca){
                count++;
            }
            else{
                count--;
            }
        }
        return ca;
    }
}