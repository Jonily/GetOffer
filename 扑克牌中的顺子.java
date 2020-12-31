class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zCount = 0;
        int nCount = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == 0){
                zCount++;
            }else if(nums[i] == nums[i+1]){
                return false;
            }else if(nums[i]+1 != nums[i+1]){
                nCount += nums[i+1]-nums[i]-1;
            }
        }
        return zCount>= nCount;


    }
}