package two_pointer;

public class TwoSumProblem {
    public int[] twoSum(int[] nums, int target) {
        int[] indices=new int[2];
        int sum;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    indices[0]=i;
                    indices[1]=j;
                }
            }

        }
        return indices;
    }
}
