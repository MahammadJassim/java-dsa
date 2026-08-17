public class CeilingNumber{
    public static void main(String []args){
        int arr [] = {2,4,6,8,9,14,16,18};
        int target = 15;
        int ans = ceilingNumber(arr, target);
        System.out.println(ans);
    } 
    static int ceilingNumber(int []arr , int target){
        int start =0;
        int end = arr.length-1;
        if(target > arr[arr.length-1]){
            return -1;
        }
        while(start<= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return arr[start];
    }
}