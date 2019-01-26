package com.Hello;

import java.io.IOException;

import org.apache.commons.io.IOUtils;




public class HelloWorld {

	public static void main(String[] args) {
		
		HelloWorld hw = new HelloWorld();//src/
		System.out.println(hw.getFileWithUtil("parcel/parcel1.txt"));
		System.out.println("nitin world"+hw.getFileWithUtil(args[0]));

	}

	private String  getFileWithUtil(String fileName) {
		String result = "";
		
		ClassLoader classLoader = getClass().getClassLoader();
		try {
		    result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
		//	String result1  = classLoader.getResource("parcel1.txt").getPath();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		return result;
	  }
	

}
