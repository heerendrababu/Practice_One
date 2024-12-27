package com.techtez.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterInsideTry
{

	public static void main(String[] args) 
	{
      String path = "c:\\FilesHandlingEx\\Bufferwriter.txt";
      BufferedWriter writer = null;
      try
      {
    	  writer = new BufferedWriter(new FileWriter(path));
    	  writer.write("In try-with-resources, we declare resources (like BufferedWriter) in parentheses.");
    	  writer.newLine();
    	  writer.write("Java automatically closes these resources when the try block finishes, even if an exception occurs.");
    	  writer.newLine();
    	  writer.write("Declaring BufferedWriter inside the parentheses ensures that it’s properly closed after use, so you don’t need to manually close it.");
    	  writer.newLine();
    	  writer.write("If you put BufferedWriter inside the try block, you’d have to close it manually:");
      }
      catch(IOException ex)
      {
    	  ex.printStackTrace();
      }
      finally
      {
    	  if(writer != null)
    	  {
    		  try
    		  {
    			  writer.close();
    		  } catch (IOException e) 
    		  {
    			  e.printStackTrace();
    		  }
    	  }
      }
      
      File f = new File(path);
      System.out.println(f.exists());
      
      // for deleting the file.
//      f.delete();
//      System.out.println(f.exists());
      
    // securing the file that from fileExplorer we can't able to modify it.
     if(f.exists())
     {
    	 if(f.setReadOnly())
    	 {
    		 System.out.println("file is secured");
    	 }
    	 else
    		 System.out.println("can't able to secure this file");
     }
     else
    	 System.out.println("file not exists");
	}

}
