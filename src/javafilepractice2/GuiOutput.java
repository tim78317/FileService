/*
 * This is the Gui output class. This class implements the FileOutputStrategy intereface and 
 * all of its methods. This classes purpose is only for outputing the file in Gui format. 
 * 
 * 
 */
package javafilepractice2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tim78317
 * version 1.0
 * since 1.5
 */
public class GuiOutput implements FileOutputStrategy{

    @Override
    public void OutputFile() {
        
    }

    
    /**
     * This method does the JOption pane for outputting to the Gui. 
     * @param d 
     */
    @Override
    public void OutputRecord(String s) {
     
      
        JOptionPane.showMessageDialog(null, s);
    }

    @Override
    public void outputEntryMessage() {
        JOptionPane.showMessageDialog(null, "Enter a record: ");
        JOptionPane.showInputDialog(this);
    }

    @Override
    public void outputAnotherEntryMessage() {
        JOptionPane.showMessageDialog(null, "Do you want to make another entry?: ");
    }

    @Override
    public void outputExceptionMessage() {
        JOptionPane.showMessageDialog(null, "Houston we have a problem.....");
    }

    @Override
    public void outputEndOfFileMessage(String data) {
        JOptionPane.showMessageDialog(null, "Wrote file to: " + data);
        JOptionPane.showMessageDialog(null, "End of file.......");
    }

    @Override
    public void entryErrorMessage() {
       JOptionPane.showMessageDialog(null, "Please Enter a Y or N: ");
    }

    @Override
    public void noEntryMessage() {
        
    }

  
    
}
