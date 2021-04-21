package org.example;

public class Substr {
    public static void main(String[] args) {
        String str= new String("Ok this is not as long!");
        int  len=str.length();
        System.out.println("string is =Ok this is not as long!");
        System.out.println("but substring will be");
        System.out.println(str.substring(11, len));
    }
}
