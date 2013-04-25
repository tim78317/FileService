package javafilepractice2;
import java.util.List;





/**
 *
 * @author tim78317
 */
public class ConsoleOutput implements FileOutputStrategy{
    

   
    @Override
    public void OutputFile() {
    
           
    }

    @Override
    public void OutputRecord(String d) {
        System.out.println(d);
    }
        
}
