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

    @Override
    public void outputEntryMessage() {
        System.out.println("Enter Record: ");
    }

    @Override
    public void outputAnotherEntryMessage() {
       System.out.println("Do you want to add another record? ");
    }

    @Override
    public void outputExceptionMessage() {
        System.out.println("Houston, we have a problem! reading this file");
    }

    @Override
    public void outputEndOfFileMessage(String data) {
          System.out.println("Wrote file to:" + data);
          System.out.println("end of writing record....");
    }

    @Override
    public void entryErrorMessage() {
        System.out.println("Please enter a Y or N: ");
    }

    @Override
    public void noEntryMessage() {
       System.out.println("Please make an entry: ");
    }
        
}
