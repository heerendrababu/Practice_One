package com.techtez.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx 
{

   	public static void main(String[] args) 
	{
      String filepath = "C:\\FilesHandlingEx\\sample.txt";
      
// BufferedWriter provides efficient writing by buffering the output, reducing the number of write operations.
// BufferedWriter uses a buffer to store data and write it in large chunks.
//      BufferedWriter inside the parentheses ensures that -
//    it’s properly closed after use, so you don’t need to manually close it.
      try(BufferedWriter writer = new BufferedWriter(new FileWriter(filepath)))
      {
    	  
          writer.write("Hello");
    	  writer.newLine();
    	  writer.write("Mr.Heerendra Babu");
    	  System.out.println("Data successfully written into the file");
    			  
      }
      catch(IOException e)
      {
    	  e.printStackTrace();
      }
      
      
      File file = new File("C:\\FilesHandlingEx\\sample.txt");
      if(file.exists())
      {
    	  System.out.println("true");
      }
      else
    	  System.out.println("false");
      
//  * - Folders can only be deleted if they are empty.
//      if(file.delete())
//      {
//    	  System.out.println("file deleted successfully"+file);
//      }
//      else
//    	  System.out.println("file not deleted");
//	}
	}
}
