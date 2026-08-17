public class OrderAgnosticbs {
    public static void main(String args[]){
           // int [] arr = {2,4,6,8,12,15,22,34,36};
            int [] arr = {36,34,22,15,12,8,6,4,2};
        
        int target = 34;
        int result = orderAgnosticBS(arr, target);
        if(result == -1){
            System.out.println("Element not found..");
        }
        else{
            System.out.println("Element found at index: "+ result);
    }
    }
    static int orderAgnosticBS(int [] arr, int target){
        int start =0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];
        
        while(start<=end){
            int mid = start+ (end -start)/2;
            if(arr[mid]==target){
                return mid;
            }
                if(isAsc){
                    if(arr[mid]<target){
                        start = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
                else{
                    if(arr[mid]<target){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
            }
        return -1;
    }
    
}
