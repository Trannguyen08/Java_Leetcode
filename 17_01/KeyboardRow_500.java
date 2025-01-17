import java.util.Arrays;

public class KeyboardRow_500 {
    public String[] findWords(String[] words) {
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";

        String ans[] = new String[words.length];
        int index = 0;
        for( String s : words ) {
            boolean str1Check = false;
            boolean str2Check = false;
            boolean str3Check = false;
            boolean check = false;
            for( Character c : s.toCharArray() ){
                if( str1.indexOf(Character.toLowerCase(c)) != -1 ) {
                    str1Check = true;
                }
                if( str2.indexOf(Character.toLowerCase(c)) != -1 ) {
                    str2Check = true;
                }
                if( str3.indexOf(Character.toLowerCase(c)) != -1 ) {
                    str3Check = true;
                }
                if( str1Check && str2Check || str2Check && str3Check || str1Check && str3Check ) {
                    check = true;
                    break;
                }
            }
            if( !check ) {
                ans[index++] = s;
            }
        }
        return Arrays.copyOf(ans, index);
    }
}
