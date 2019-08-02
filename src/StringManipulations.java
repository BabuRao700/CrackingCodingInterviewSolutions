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

    //1.3: function to remove duplicate characters in a string
    public String removeDuplicatesInString(String str) {
        String resultStr = str;
        if(str == null) return null;

        if(str.length() < 2) return resultStr;

        for(int i=0; i<resultStr.length(); i++) {
            for(int j=i+1; j<resultStr.length(); j++) {
                if(resultStr.charAt(j) == resultStr.charAt(i)) {
                    StringBuilder tempStr =
                            new StringBuilder(resultStr.substring(0, j) + resultStr.substring(j+1));
                    resultStr = tempStr.toString();
                }
            }
        }
        return resultStr;

    }



}
