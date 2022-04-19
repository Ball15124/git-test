/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Student
 */
public class CityRandomAccessFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            // TODO code application logic here
            RandomAccessFile fPointer = new RandomAccessFile("city.dat","rw");
            byte[] x = new byte[150];
            fPointer.read(x,0,150);
            System.out.println(new String(x));
            fPointer.seek(381);
            System.out.println(fPointer.readInt());
            boolean notFound = true;
            int record = 0;
            while(notFound) {
                fPointer.seek(record*385);
                fPointer.read(x, 0, 150);
                System.out.println(new String(x));
                record++;
                if(record==10){
                    notFound = false;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CityRandomAccessFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CityRandomAccessFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
