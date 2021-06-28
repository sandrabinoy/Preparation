package week1.day1;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        String[] strArray = s.toLowerCase().split("[^a-zA-Z0-9]");
        //  //W includes underscore for some reason so had to specify the alphanumeric characters.
        int length = strArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        String normalStr = "";

        for(int i = 0; i < length; i++) {
            stringBuffer.append(strArray[i]);
        }
        normalStr = stringBuffer.toString();
        System.out.println(normalStr);
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString());

        if(stringBuffer.toString().equals(normalStr)) {
            return true;
        }

        return false;

    }

}
