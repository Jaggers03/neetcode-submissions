class Solution {
    public int sumOfDigits(int[] nums) {
        int smallest = nums[0];
        for(int i = 1; i < nums.length; i++){
            if (nums[i] < smallest){
                smallest = nums[i];
            }
        }

        int digitsum = 0;
        while (smallest > 0){
            digitsum += smallest % 2;
            smallest /= 10;
        }


        if(digitsum % 2 == 0){
            return 1;
        } else {
            return 0;
        }

    }
}
