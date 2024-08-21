// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]


package ProblemOfTheDay.Day3;

public class RotateArray {
    
        public void rotate(int[] nums, int k) {
            int l = nums.length;
            int[] rotated = new int[l];
            for(int i=0;i<l;i++){
                rotated[(i+k)%l]=nums[i];
            }
            for(int i =0;i<l;i++){
                nums[i]=rotated[i];
            }
        }
}
