package jazz;

import javax.swing.JPanel;

import java.io.FileInputStream;  
public class TestLevel {  
	
     public static void main(String args[]){    
    	 System.out.print("test");
          try{    
            FileInputStream fin=new FileInputStream("test.lvl");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  