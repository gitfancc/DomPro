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


public class ClassTest  extends Animal{
  public void say(){
	  System.out.println("thi is classtest");
  }
  
  public static void main(String[] args){
	  Animal animal = new ClassTest();
	  animal.say();
  }
	
}


 class Animal{
	
	public void say(){
		System.out.println("this is animal");
		
	};
}