import java.util.Arrays;

public class FirstLastPositionArray{
    public static void main(String [] args){
        int [] arr = {5,7,7,8,8,10};
        int target =8;
        int []ans = ans(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] ans(int [] arr, int target){
        int[] ans = {-1,-1};
        int start =0;
        int end = arr.length-1;
        ans[0] = indexSearch(arr, target, start, end, true);
       
        if(ans[0]!= -1){
             ans[1] = indexSearch(arr, target, start, end, false);
        }
        return ans;
    }
    static int indexSearch(int []arr, int target, int start, int end, boolean findFirstIndex){
        int ans = -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target< arr[mid]){
                end = mid-1;
            }
            else{
                ans = mid;
                if(findFirstIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}