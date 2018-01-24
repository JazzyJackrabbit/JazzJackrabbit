package jazz;

import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Pan extends JPanel {
	


	private ArrayList<Double> images;

	public void paintComponent(Graphics g) {

		try {

			// fis = new FileInputStream(new File("test.lvl"));

			// String V = "" + i;
			int z = 0;
			int i=0;  
			int yg = 0;
			int xg = 0;
			
			FileInputStream file=new FileInputStream("src\\test.lvl");    
			 
			do {
				do{
			
					i++;
		        
					while((i=file.read())!=-1){    
		           
						//System.out.print((char)i);   
						Image img = ImageIO.read(new File("src\\IC\\1E\\" + i + ".png"));
						g.drawImage(img, xg, yg, this);
						System.out.println(""+xg+" "+yg+" "+i+" - ");    
						//long start=System.nanoTime(); 
						//while((System.nanoTime()-start)<1000); 
					} 
					
					xg++;
				}while(xg<64);
				yg++;
			}while(yg<64);
		
			
			file.close(); 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
