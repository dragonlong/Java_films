// Service for Films database processing
// author Xiaolong Li
// Right reserved by Dragon inc. 2016-2017
// log:

// all in the hw1 directory
/*package hw1;
 */

import java.io.*;
import java.lang.*;
import java.nio.file.Paths;
import java.nio.file.*;
import java.nio.*;
import java.lang.*;
import java.io.*;
import java.io.File;
import java.io.InputStream;
import java.io.BufferedReader;
import java.util.*;
import java.nio.charset.Charset;

public class Films{
    public String command; //container for separate viriables
    private Date ReleaseDate; //Date
    private String Title;
    private String Director;
    private boolean Watched;
    public static void main(String args[]) throws IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;
        Path file = Paths.get("in.txt");
        Charset charset = Charset.forName("UTF-8");
        char separ_symbol = '\t';
        // to pull out the core viriables
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                int Index_last = 0;
                int Index_curr = line.indexOf(' ');
                int k = 0;//to show the sequence
                String[] Data_input=new String[15];
                while(Index_curr<line.length()&&Index_curr!=(-1)){
                    System.out.println(Index_curr);
                    Data_input[k] = line.substring(Index_last,Index_curr);
                    System.out.println(Data_input[k]);
                    Index_last = Index_curr;
                    Index_curr = line.indexOf(' ',Index_last+1);
                    k++;
                }
                Data_input[k] = line.substring(Index_last);
                System.out.println(Data_input[k]);
            //sort to correct container
                
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        
        try (){
        
        }

    }
}


