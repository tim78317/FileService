package javafilepractice2;

import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tim78317
 */
public interface FileOutputStrategy {
    
    public void OutputFile();
    
    public void OutputRecord(String d);
    
     
    
    public void outputEntryMessage();
    
    public void outputAnotherEntryMessage();
    
    public void outputExceptionMessage();
    
    public void outputEndOfFileMessage(String data); 
    
    public void entryErrorMessage(); 
    
    public void noEntryMessage(); 
}
