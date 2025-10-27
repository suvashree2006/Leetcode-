 //Brute Force Approach
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-3; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<n-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int st=j+1, end=n-1;
                while(st<end){
                    long sum = (long)nums[i]+nums[j]+nums[st]+nums[end];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[st],nums[end]));
                    
                     while(st<end && nums[st]==nums[st+1]) st++;
                     while(st<end && nums[end]==nums[end-1]) end--;
                     st++;
                     end--;
                    }
                    else if(sum<target){
                        st++;
                    }
                    else{
                        end--;
                    }
                }
            }
        }
        return ans;
    }
}