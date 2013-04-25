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
public interface WriteFileStrategy {
    
    public abstract void writeToFile();
    
      public void setPath(String path);
       
    
}
