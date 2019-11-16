import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        int[] arrA = new int[26];
        int[] arrB = new int[26];
        for(int i=0;i<26;i++){
            arrA[i] = 0;
            arrB[i] = 0;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();
        for(int o=0;o<a.length();o++){
            arrA[a.charAt(o)-'a']++;
        }
        for(int i=0;i<b.length();i++){
            arrB[b.charAt(i)-'a']++;
        }
        boolean retu = true;
        for(int i=0;i<26;i++){
            if(arrA[i]!=arrB[i]){
                retu = false;
            }
        }
        return retu;
    }

    public static void main(String[] args) {
