
package javafilepractice2;

import java.io.File;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author tim78317
 */
public class JavaFilePractice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext(
                new String[]{"fileServiceContext.xml"});
        
         FileService fs = (FileService)ctx.getBean("fileService"); 
         fs.setPath("C:\\Users\\tim78317\\Desktop"
             + "\\adv. java programming\\JavaFilePractice2\\src\\javafilepractice2\\example2.txt");
         fs.readOrWriteToFile();
         fs.outputRecord();
    }
}

        