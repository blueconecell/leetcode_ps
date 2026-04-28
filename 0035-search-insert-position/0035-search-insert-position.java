class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        int r = Arrays.binarySearch(nums,target);
        if(r<0){
            r = -r-1;
        }
        ans = r;
        return ans ;
    }
}