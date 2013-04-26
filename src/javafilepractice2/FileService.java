
package javafilepractice2;

/**
 *
 * @author tim78317
 */
public class FileService {
  
    
 
    private FileStrategy fs;
    
    public FileService(FileStrategy fs) {
        this.fs = fs;
         
        
    }
    
    public void readOrWriteToFile(){

        fs.readOrWriteToFile();
    }
    public void setPathRead(String p){
        fs.setPath(p);
    }
    public void setPath(String p){
        fs.setPath(p);
    }
    public void outputRecord(){

        fs.OutputRecord();
    }
  
  
   
}


