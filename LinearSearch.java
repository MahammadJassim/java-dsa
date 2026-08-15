public class LinearSearch{
    public static void main(String args[]){
        int nums[] = {10,202,30,400,56,101};
        int target = 56;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        int ans1 = linearsearch1(nums, target);
        System.out.println(ans1);
    }
    static int linearsearch1(int nums[],int target){
        if(nums.length ==0){
            return Integer.MAX_VALUE;
        }
        for(int element:nums){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    static int linearSearch(int []nums, int target){
        if(nums.length ==0){
            return Integer.MAX_VALUE;
        }

        for(int index =1; index<nums.length; index++){
            int element = nums[index];
            if(element == target){
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }
}