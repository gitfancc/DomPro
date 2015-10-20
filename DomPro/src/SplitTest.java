import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import javax.swing.text.AbstractDocument.BranchElement;


public class SplitTest {
	
	public static void splitEle(){
		String fruit = "apple-banana-blue berry-pineapple- ";
		System.out.println(fruit.split("-").length);
	}
    
    public static void bufferedReaderTest(){
     	
    } 
	public static void main(String[] args){
		SplitTest.splitEle();
	}
}
