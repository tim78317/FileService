package javafilepractice2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author tim78317
 */
public class ReadFile implements ReadFileStrategy {

    private String path = null;
    private FileOutputStrategy fos;
    List<String> p = new ArrayList<String>();
    List<String> p2 = new ArrayList<String>();

    public ReadFile() {
    }

    public void setPath(String path) {
        this.path = path;
    }

    public FileOutputStrategy getFos() {
        return fos;
    }

    public void setFos(FileOutputStrategy fos) {
        this.fos = fos;
    }

    public List<String> getP() {
        return p;
    }

    public void setP(List<String> p) {
        this.p = p;
    }
    

    public void readAllFiles() {

        File data = new File(path);


        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                p.add(line);
                //System.out.println(line);
                line = in.readLine();  // strips out any carriage return chars
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                
               for (String item : p){
                   p2.add(item);
               }
 
                in.close();
            } catch (Exception e) {
            }


        }

         
         }
         
   
  
    
    @Override
    public void record() {
        
         
    }

    public static void main(String[] args) {
        ReadFile rf = new ReadFile();


        rf.setPath("C:\\Users\\tim78317\\Desktop\\adv. java programming\\JavaFilePractice2\\src\\javafilepractice2\\example2.txt");
        rf.readAllFiles();
        
    }
}