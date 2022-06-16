package com.company;
import java.io.*;

public class writef1 {
    public static void main(String[] args) {
        char [] arr=new char[87];
        try{
            FileInputStream f=new FileInputStream("D:\\java.txt");
            InputStreamReader obj1=new InputStreamReader(f);
            obj1.read(arr);
            System.out.println(arr);
        }
        catch(Exception e)
        {
            e.getStackTrace();
            System.out.println();
        }
    }
}
