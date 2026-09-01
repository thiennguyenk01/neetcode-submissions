class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int valueMax = Integer.MIN_VALUE;
        int length = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
            {
                valueMax = Math.max(valueMax, length);
                length = 0;
            }
            else{
                length++;
            }
        }

        if(length != 0){
            valueMax = Math.max(valueMax, length);
        }

        return valueMax;
    }
}