package viikko4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteIO {
    
    public void readAndWrite(String read, String write) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(read));
            BufferedWriter bw = new BufferedWriter(new FileWriter(write));
            String output = "";
            while ((output = br.readLine()) != null) {
                if (output.trim().length() < 30) {
                    if (output.trim().length() > 0) {
                        if (output.contains("v") == true) {
                            bw.write(output + "\n");
                        }
                    }
                }
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}