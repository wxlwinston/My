package com.asiainfo.stock;

public class test {
    public static void main(String[] args) {
        String s ="asdas@sdfasdf.com";
        System.out.println(s);
        int location = s.indexOf("@");
        String c=s.substring(0,location);
        System.out.println(c);
        Boolean a="".equals(s);
        if(a){
            System.out.println(111);
        }else{
            System.out.println(222);
        }
    }
}
