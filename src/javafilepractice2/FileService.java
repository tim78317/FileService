
package javafilepractice2;

/**
 *
 * @author tim78317
 */
public class FileService {
  
    private FileOutputStrategy fos; 
    
    
    
    
    public FileService(ReadFileStrategy rfs, FileOutputStrategy fos) {
        this.rfs = rfs;
        this.fos = fos; 
    }
    
    public void readFiles(){
        rfs.readAllFiles();
    }
    public void setPath(String p){
        rfs.setPath(p);
    }
    
    public void record(){
    rfs.record();
}
    public void OutputFile(){
       fos.OutputFile();    
        
   }
}
