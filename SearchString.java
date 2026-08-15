public class SearchString {
    public static void main(String []args){
        String str = "Midhuna";
        char target = 'm';
        System.out.println(search(str, target));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
         target = Character.toLowerCase(target);
        for(int i=0; i<str.length(); i++){
            if(target == Character.toLowerCase(str.charAt(i))){
                return true;
            }
        }
        return false;
    }
    
}
