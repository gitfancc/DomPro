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


public class FileTest {
	
	public static void fileInputStreamTest() throws Exception{
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\asus\\Desktop\\sunflower.jpg"));
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\asus\\Desktop\\sunflower1.jpg"));
		byte[] buf = new byte[1024];
		int numread = 0;
		while((numread = (fis.read(buf))) != -1){
			fos.write(buf,0,numread);
		}
		fos.flush();
		fis.close();
		fos.close();
	}
    
    public static void bufferedReaderTest(){
    	String file1 = "c:"+File.separator+"Users"+File.separator+"asus"+File.separator+"Desktop"+File.separator+"agentjs.js";
    	FileReader fr= null;
    	try {
			fr = new FileReader(file1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	BufferedReader bf = new BufferedReader(fr);
    	StringBuilder sb = new StringBuilder();
    	try {
			while(bf.readLine() != null){
				sb.append(bf.readLine());
				sb.append("\n");
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	
    } 
	public static void main(String[] args){
		try {
			//FileTest.fileInputStreamTest();
			FileTest.bufferedReaderTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
