package app.com.pattern;


import java.io.*;
import java.util.Scanner;
class reverseString {
 public static void main (String[] args) {
   Scanner sc = new Scanner(System.in);
   String s1 = sc.nextLine();
   String str1[] = s1.split(" ");
   String s2="";
   for(String c1:str1){
   
     s2 = c1 + " " +s2;
   }
   System.out.println("Reversed word: "+ s2);
 }
 }
