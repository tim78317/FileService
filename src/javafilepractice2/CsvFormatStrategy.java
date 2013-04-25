package javafilepractice2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author Instlogin
 */
public class CsvFormatStrategy implements FormatStrategy{
    
    @Override
    public List<LinkedHashMap<String,String>> decode(List<String> rawData, boolean hasHeader) {
        List<LinkedHashMap<String,String>> decodedData = 
                new ArrayList<LinkedHashMap<String,String>>();
        
        int lineCount = 0;
        
        String[] header = null;
        for(String data : rawData) {
            lineCount++;
            String[] parts = data.split(",");
            if(hasHeader && (lineCount == 1)) {
                header = parts;
//                continue;
            }
            
             LinkedHashMap<String,String> record = 
                        new LinkedHashMap<String,String>();   
            for(int i=0; i < parts.length; i++) {
                if(hasHeader && (lineCount == 1)) {
                    break;
                } else if(hasHeader) {
                    record.put(header[i], parts[i]);
                } else {
                    record.put(""+i, parts[i]);
                }
            }
            if(lineCount != 1) decodedData.add(record);
        }
        
        return decodedData;
    }
    
  
}
