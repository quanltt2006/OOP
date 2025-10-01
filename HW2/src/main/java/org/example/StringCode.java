package org.example;
import java.util.HashSet;
import java.util.Scanner;

public class StringCode {
    public static String translate(int n , char s) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += s;
        }
        return result;
    }
    public static String blowup(String str) {
        int n =  str.length();
        StringBuilder result = new StringBuilder();

        for (int i =0 ; i < n ; i++) {
            char c = str.charAt(i);
            if (i + 1 < n ) {
                if(Character.isDigit(c)) {
                    int digit = c - '0';
                    char next = str.charAt(i + 1);
                    result.append(translate(digit, next));
                }
                else {
                    result.append(c);
                }

            }
        }
        return result.toString();
    }
    public static int maxRun (String str) {
        int current = 0 ;
        int max = 0 ;
        int i = 1 ;
        while (i < str.length()) {
            if(str.charAt(i) == str.charAt(i-1)) {
                current ++;
            } else {
                current = 1;
            }
            if (current > max) {
                max = current ;
            }
            i++;
        }
        return max ;

    }
    public static boolean stringIntersect(String a, String b , int len ) {
        if( len <= 0 || a.length() < len || b.length() < len) {
            return false;
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < a.length() - len; i++) {
            String sub = a.substring(i,i+len);
            set.add(sub);
        }
        for (int i = 0; i < b.length() - len; i++) {
            String sub = b.substring(i,i+len);
            if(set.contains(sub)) {return true;
            }
        }
        return false;



    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  ans = input.nextLine();
        String  ans1 = input.nextLine();

        System.out.println(StringCode.stringIntersect(ans,ans1, 3));
    }
}
