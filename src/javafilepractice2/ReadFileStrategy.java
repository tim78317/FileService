/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafilepractice2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tim78317
 */
public interface ReadFileStrategy extends FileStrategy{
    
    
    
    @Override
    public void readOrWriteToFile();
    
   
    @Override
    public void setPath(String p);
    
    
    
 
    @Override
    public void OutputRecord();
}
