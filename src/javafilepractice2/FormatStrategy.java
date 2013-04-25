/**
 * This is the interface class for Formatting the file.
 * The methods in this class.....
 */
package javafilepractice2;

import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author tim78317
 * version 1.0
 * since 1.5
 */
public interface FormatStrategy {
     public List<LinkedHashMap<String,String>> decode(List<String> rawData, boolean hasHeader);
}
