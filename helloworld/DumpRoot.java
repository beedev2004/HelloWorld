/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bill
 */
import java.io.File;
import java.io.IOException;

public class DumpRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
       
       File file = new File("bee.txt");
       System.out.println("Absolute path = "+file.getAbsolutePath());
       System.out.println("Name = "+file.getName());
       System.out.println("Parent = "+file.getParent());
       System.out.println("Path = "+file.getPath());
       System.out.println("Is absolute = "+file.isAbsolute());
    }
}
