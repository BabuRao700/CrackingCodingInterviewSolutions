import java.util.Arrays;

public class StringManipulations {

    //1.1
    public boolean isStringWithAllUniqueCharacters(String str){

        if(str.length() == 0) return false;

        if(str.length() == 1) return true;

        for(int i=0; i<str.length()-1; i++) {
            for(int j=i+1; j<str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) return false;
            }
        }

        return true;
    }

    //1.2 : make string reverse using java
    public String makeStringReverse(String str) {
        int i=str.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(i >=0) {
            sb.append(str.charAt(i));
            i--;
        }
        return sb.toString();
    }

}
