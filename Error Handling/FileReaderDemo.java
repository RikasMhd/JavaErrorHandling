/*import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {
        BufferedReader br = null;

            // Step 1: Get filename from command line
            String filename = args[0];

            // Step 2: Open the file
            br = new BufferedReader(new FileReader(filename));

            // Step 3: Read and display file content
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

     }

}*/

import java.io.*;
public class FileReaderDemo{
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            // Step 1: Get filename from command line
            String filename = args[0];

            // Step 2: Open the file
            br = new BufferedReader(new FileReader(filename));

            // Step 3: Read and display file content
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: No filename provided. Please provide a filename.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");

        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");

        } finally {
            // Step 4: Close the file resource
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Failed to close the file.");
            }
        }
    }
}


