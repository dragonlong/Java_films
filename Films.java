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
    public static void main(String args[]) throws IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;
        Path file = Paths.get("in.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

    }
}


