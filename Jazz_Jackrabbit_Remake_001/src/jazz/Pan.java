// Affichage et fichier

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
import java.awt.*;

public class Pan extends JPanel {
	


	private ArrayList<Double> images;

	public void paintComponent(Graphics g) {

		int yg = 0;
		int xg = 0;
		
		
		try {

			setBackground (Color.cyan);
			
			// fis = new FileInputStream(new File("test.lvl"));

			// String V = "" + i;
			int z = 0;
			int i=0;  

			FileInputStream file=new FileInputStream("src\\test.lvl");    
			 
			//background
			Image imgciel = ImageIO.read(new File("src\\IC\\ciel.png"));
			g.drawImage(imgciel, 0, 0, (int)(640*1.5), (int)(480*1.5),this);
				
			for(yg=0;yg<64;yg++) {
				for(xg=0;xg<256;xg++) {
			
					
					i=file.read(); 
		           
						//System.out.print((char)i);   
						Image img = ImageIO.read(new File("src\\IC\\1E\\" + (i) + ".png"));
						g.drawImage(img, xg*32, yg*32, this);
						System.out.println(""+xg+" "+yg+" "+i+" - "); 
						//long start=System.nanoTime(); 
						//while((System.nanoTime()-start)<1000); 
				
					
				}
			}
			
			
			
			file.close(); 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
