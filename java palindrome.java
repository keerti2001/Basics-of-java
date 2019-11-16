import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String reverse="";
        int j,flag=0;
        /* Enter your code here. Print output to STDOUT. */
        for(int i = str. length() - 1; i >= 0; i--) 
        {
reverse = reverse + str. charAt(i); }
for(j=0;j<str.length();j++)
{
if(str. charAt(j)==reverse. charAt(j))
flag++;
}
     if(flag==str.length())
     System.out.print("Yes");
     else
      System.out.print("No");
        
    }
}



