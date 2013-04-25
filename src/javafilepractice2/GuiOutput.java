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
    public void OutputRecord(String d) {
      
        JOptionPane.showMessageDialog(null, d);
    }
    
}
