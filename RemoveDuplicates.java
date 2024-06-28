public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];

    public static void RemoveDuplicates( String str , int idx , String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map [currChar - 'a'] ){
            RemoveDuplicates(str, idx+1, newString);
        }else{
             newString += currChar;
             map[currChar - 'a'] = true;
             RemoveDuplicates(str, idx+1, newString);

        }

    }
    public static void main(String args[]){
        String str = "abaccbd";
        RemoveDuplicates(str, 0, "");

    }

    
}
