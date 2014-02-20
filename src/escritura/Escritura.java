/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.internal.jfr.events.FileWriteEvent;

/**
 *
 * @author ESPRIMO
 */
public class Escritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
            // TODO code application logic here
        
        BufferedReader origen1 = new BufferedReader(new FileReader("origen1.txt"));
        BufferedReader origen2 = new BufferedReader(new FileReader("origen2.txt"));
        PrintWriter fusio =new PrintWriter(new FileWriter("fusio.txt"));
        String linia1 = null, linia2 =null;
        
        while((linia1=origen1.readLine())!=null){
            fusio.println(linia1);
            if((linia2=origen2.readLine())!=null) fusio.println(linia2);
        }
        
        while((linia2=origen2.readLine())!=null) fusio.println(linia2);
        origen1.close();
        origen2.close();
        fusio.close();
        
            
        origen1=new  BufferedReader(new FileReader("fusio.txt"));
        while((linia1=origen1.readLine())!=null) System.out.println(linia1);
        origen1.close();
        System.out.println("hosadl");
        }
            
        }
   
        
        

