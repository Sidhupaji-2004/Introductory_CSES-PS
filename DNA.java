import java.util.*;
public class DNA {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String DNA_seq = kb.nextLine();
        kb.close();//input

        int result = 1;
        char[] chars = DNA_seq.toCharArray();
        int long_seq = 1;
        for(int i  = 1; i<chars.length ;i++){
            if(chars[i] != chars[i-1]){
                long_seq = 1;
            }
            else{
                long_seq++;
            }
            result = Math.max(result, long_seq);
        }
        System.out.println(result);
    }    
}
