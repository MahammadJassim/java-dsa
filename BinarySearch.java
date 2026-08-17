public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,12,15,22,34,36};
        
        int target = 346;
        int result = binarySearch(arr, target);
        if(result == -1){
            System.out.println("Element not found..");
        }
        else{
            System.out.println("Element found at index: "+ result);
    }
        }
        
    
    static int binarySearch(int [] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start+(end -start)/2;
            if(arr[middle] == target){
                return middle;
            }
            else if(target>arr[middle]){
                start = middle+1;
            }
            else if(target<arr[middle]){
                end = middle-1;
            }
        }
        return -1;
    }
}
