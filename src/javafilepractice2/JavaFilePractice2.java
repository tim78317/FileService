
package javafilepractice2;

import java.io.File;

/**
 *
 * @author tim78317
 */
public class JavaFilePractice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
//        ReadFile p = new ReadFile(new ConsoleOutput());
//        p.setPath("C:\\Users\\tim78317\\Desktop\\adv. java programming\\JavaFilePractice2\\src\\javafilepractice2\\example2.txt");
//        p.readAllFiles();
//        
        
        FileService fs = new FileService(new ReadFile(), new ConsoleOutput());
        fs.setPath("C:\\Users\\tim78317\\Desktop\\adv. java programming\\JavaFilePractice2\\src\\javafilepractice2\\example2.txt");
        fs.readFiles();
        fs.OutputFile();
       
        
    }
}
