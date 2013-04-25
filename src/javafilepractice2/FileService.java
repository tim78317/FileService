
package javafilepractice2;

/**
 *
 * @author tim78317
 */
public class FileService {
  
    
    private ReadFileStrategy rfs; 
    private WriteFileStrategy wfs; 
    
    
    public FileService(ReadFileStrategy rfs, WriteFileStrategy wfs) {
        this.rfs = rfs;
        this.wfs = wfs; 
        
    }
    
    public void readFiles(){
        rfs.readAllFiles();
    }
    public void setPathRead(String p){
        rfs.setPath(p);
    }
    public void setPathWrite(String p){
        wfs.setPath(p);
    }
    public void outputRecord(){
        rfs.OutputRecord();
    }
   public void writeToFile(){
       wfs.writeToFile();
   }
}


