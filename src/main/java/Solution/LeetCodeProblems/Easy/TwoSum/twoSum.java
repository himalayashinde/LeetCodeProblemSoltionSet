///*
//1. Two Sum
//Easy
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
// */
package Solution.LeetCodeProblems.Easy.TwoSum;

 class twoSum{

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = nums[i];
                    result[1] = nums[j];
                    //return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 17;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

 }