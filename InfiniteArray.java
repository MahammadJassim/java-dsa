public class InfiniteArray {
    public static void main(String [] jassim){
        int [] arr = {2,4,6,8,10,12,14,18,19,21,25,30,34,38,45,97};
        int target = 19;
        int ans = ans(arr, target);
        System.out.println(ans);
    }
    static int ans(int[] arr, int target){
        int ans  =-1;
         int start =0;
         int end =1;
         while(target> arr[end]){
            int temp = end+1;
            end = end+(end-start+1)*2;
            start = temp;
             ans = indexSearch(arr,target, start, end);
         }
        
         return ans;
    }
    static int indexSearch(int []arr,int target, int start, int end){
        if(target> arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start =mid+1;
            }
            else if(target< arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
