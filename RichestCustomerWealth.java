public class RichestCustomerWealth {
    public static void main(String[] args) {
       int [][] accounts = {
        {1,2,3},
        {3,2,1},
        {7,8,9}
    };
    System.out.println(maxWealthAccount(accounts));
    }
    static int maxWealthAccount(int [][] accounts){
        int ans =Integer.MIN_VALUE;
        for(int [] person : accounts){
            int sum =0;
            for(int account:person){
                sum += account;
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
        
    }
    
}
