class Solution {
    public long maximumSumScore(int[] nums) {
        long total = 0;

        for (int num : nums){
            total += num;
        }

        long prefix = 0;
        long largestscore = Long.MIN_VALUE; 

        for (int i = 0; i<nums.length; i++){
            prefix += nums[i];
            long suffix = total - prefix + nums[i];

            long score;

            if(prefix > suffix){
                score = prefix;
            } 
            else{
                score = suffix;
            }

            if(score > largestscore){
                largestscore = score;
            }


        }
        return largestscore;



    }
}
