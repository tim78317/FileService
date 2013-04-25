/**
 * This class 
 */
package javafilepractice2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tim78317
 */
public class ConsoleWriteFile implements WriteFileStrategy{
    private String path; 

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
    
    @Override
    public void writeToFile() {
        File data = new File(path);
        List<String> writeTo = new ArrayList<String>();
        String endOfWrite = " "; 
        String keepWriting = "y"; 
        
        
        
        Scanner in = new Scanner(System.in);
        
        do{
        System.out.println("Enter Record: ");
        String record = in.nextLine(); 
        writeTo.add(record);
        System.out.println("Do you want to add another record? ");
        endOfWrite = in.nextLine(); 
       
       
        }while(endOfWrite.equals(keepWriting));
        
        
        
    

    
        
	  		
      try{
          
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data)));
            
        for (String s: writeTo){
           out.println(s);
       
        }
        out.close();
          System.out.println("Wrote file to:" + data.getAbsolutePath());
        
      }catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");

        }
    }
    public static void main(String[] args) {
        
        
        
        
        ConsoleWriteFile crf = new ConsoleWriteFile();
        crf.setPath("C:\\Users\\tim78317\\Desktop"
                + "\\adv. java programming\\JavaFilePractice2\\src\\javafilepractice2\\example2.txt");
        crf.writeToFile();
        
    }
}