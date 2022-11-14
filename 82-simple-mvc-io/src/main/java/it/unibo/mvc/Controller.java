package it.unibo.mvc;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Application controller. Performs the I/O.
 */
public class Controller {
    File currentFile;
    
    public Controller(final File file){
        this.currentFile = file;
    }

    public Controller(){
        this.currentFile = new File("output.txt");
    }

    public void SetCurrentFile(final File file){
        this.currentFile = file;
    }

    public File getFile(){
        return this.currentFile;
    }

    public String getPath(){
        return this.currentFile.getAbsolutePath();
    }

    public void WriteOnFIle(final String s) throws IOException{
        try(final DataOutputStream objWrite = 
            new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(currentFile))))
        {
            objWrite.writeUTF(s);;
        }
        catch(IOException ex){
            throw new IOException(ex);
        }
    }
}
