/*
 * This is the interface for writting files. This interface must be implemented and all of 
 * its methods to use the write file classes. 
 * 
 */
package javafilepractice2;

/**
 *
 * @author tim78317
 */
public interface WriteFileStrategy extends FileStrategy {
    
    @Override
     public void readOrWriteToFile();
    
    
    @Override
    public void setPath(String path);
       
    
    @Override
    public void OutputRecord();
}
