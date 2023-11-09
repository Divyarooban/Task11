package task11;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class Filenotfoundexception{
public static void main(String[] args) throws FileNotFoundException,IOException{
File fileObj = new File("D:/JavaPractice.txt");
if(!fileObj.exists()){
throw new FileNotFoundException("This file doesnot exist in the path specified "+fileObj.toString());
}
else {
System.out.println("Welcome, we got into file "+fileObj.toString());
}
}
}