//added comments
package com.sai.iopractice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReading {

	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream(args[0]);
		//chaining
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
		  System.out.println (strLine);
		}

		//Close the input stream
		br.close();

	}

}
