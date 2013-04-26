/**
 * This class
 */
package javafilepractice2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tim78317
 */
public class WriteToFile implements FileStrategy {

    private String path;
    private boolean addTo = false;
    private FileOutputStrategy fos;

    public WriteToFile(FileOutputStrategy fos, boolean addTo) {
        this.fos = fos;
        this.addTo = addTo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void readOrWriteToFile() {
        File data = new File(path);
        List<String> writeTo = new ArrayList<String>();
        String endOfWrite = "N";
        String keepWriting = "Y";
        String entry = "";

        

        Scanner in = new Scanner(System.in);



        do {
            fos.outputEntryMessage();

            String record = in.nextLine();

            writeTo.add(record);
            fos.entryErrorMessage();
            fos.outputAnotherEntryMessage();
            entry = in.nextLine();
       
            } while (entry.toUpperCase().equals(keepWriting));


        





        try {

            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, addTo)));

            for (String s : writeTo) {
                if (addTo == true) {
                    out.println(s);
                } else {
                    out.println(s);

                }
            }
            out.close();
            fos.outputEndOfFileMessage(data.getAbsolutePath());

        } catch (IOException ioe) {
            fos.outputExceptionMessage();

        }
    }

    @Override
    public void OutputRecord() {
    }

    public static void main(String[] args) {
        WriteToFile wtf = new WriteToFile(new GuiOutput(), true);
        wtf.setPath("C:\\Users\\tim78317\\Desktop"
                + "\\adv. java programming\\JavaFilePractice2\\src\\javafilepractice2\\example2.txt");
        wtf.readOrWriteToFile();
        
    }
}
