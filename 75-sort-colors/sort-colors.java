class Solution {
    public void sortColors(int[] nums) {
        int low = 0; int mid =0; int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
               Swap(nums,mid,low);
                    mid++;
                    low++;
            } else if(nums[mid]==1){
                mid++;
            } else if(nums[mid]==2){
                Swap(nums,mid,high);
                high--;
            }
        }
    }
    void Swap(int[] nums ,int num1 , int num2){
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
            
    }
 }