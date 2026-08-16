public class EvenDigits {
    public static void main(String[] args) {
       int [] nums = {12,345,2,6,7896};
       System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count =0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int nums){
        int noofDigits = digits(nums);
       return noofDigits%2 ==0;
    }
    static int digits(int nums){
        if(nums<0){
            nums*= -1;
        }
        if(nums ==0){
            return 1;
        }
        return (int)(Math.log10(nums)+1);
    }
    
}
