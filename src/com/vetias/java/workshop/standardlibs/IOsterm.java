package src.com.vetias.java.workshop.standardlibs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOsterm {
    public static void main(String[] args) {
        try(FileInputStream inputStream =new FileInputStream("km.jpeg");
        FileOutputStream outputStream = new FileOutputStream("madhu.jpeg")){
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
}
