class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        for(int index=0;index<nums.length;index++)
        {
            int currentCheckNum = nums[index];
            int innerIndex = index+1;
            while(innerIndex<nums.length)
            {
                if(nums[innerIndex]==currentCheckNum)
                    return true;

                innerIndex++;
            }

        }
        return false;
    }

}