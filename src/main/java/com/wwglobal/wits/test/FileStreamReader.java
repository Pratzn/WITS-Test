package com.wwglobal.wits.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileStreamReader {

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\THPAN\\Desktop\\tmp.txt")));
		FileOutputStream out = new FileOutputStream(new File("C:\\Users\\THPAN\\Desktop\\FileStreamReaderResult.txt"));
		String tmp=null;
		while((tmp=br.readLine())!=null){
			//tmp=tmp.replaceAll(new String(""+(char)194), "");
			//log(tmp);
			//log("characters :: ");
			
			
			for(int i =0;i<tmp.length();i++){
				int code = (int)tmp.charAt(i);
				char character = tmp.charAt(i);
				if(code==194 || code==160){
					//log("            "+code + "    "+character);
					
				}else{
					//log(code + "    "+character);
					 System.out.print(character);
				}
				
			}
			
			}
			br.close();

	}

	  private static void log(String msg){
		  System.out.println(msg);
	  }
}
