package jazz;

import javax.swing.JPanel;

import java.io.FileInputStream;  
public class TestLevel {  
	
     public static void main(String args[]){    
    	  try{    
              FileInputStream fin=new FileInputStream("src\\test.lvl");    
              
              int i=0;    
              while((i=fin.read())!=-1){    
            	  System.out.print((char)i);    
              }
              
              fin.close();    
          }catch(Exception e){System.out.println(e);}    
     }    
}  