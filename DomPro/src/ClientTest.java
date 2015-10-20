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


public class ClientTest  extends Animal{
  public static void main(String[] args){
	  Component component = new ConcreteComponent();
	  Component c1 = new DecoratorConcrete(component);
	  c1.doSomething();
	  System.out.println("============");
	  
	  Component c2 = new DecoratorConcrete1(c1);
	  c2.doSomething();
	  
	  try {
		if( 0/1 == 1){
			System.out.println("catch content");
		}
	} 
	  finally{
		  System.out.println("finally");
	  }
  }
	
}


