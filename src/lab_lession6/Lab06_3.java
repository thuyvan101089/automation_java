package lab_lession6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab06_3 {
    /*
    * String myStr = "100 minutes";
    * NOT using REGEX, extract digit character from that String
    * Expected output: "100".
    * EX: "12345nabc678" -> "12345678"
    *
    * */
    public static void main(String[] args) {
       String myStr = "12345nabc678";
        char[] charArr = myStr.toCharArray();
        String mynewString="";
        for (char character : charArr) {
            if(Character.isDigit(character)){
                mynewString = mynewString + character;
            }
        }
        System.out.println(mynewString);
    }

}