import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Pan_Jazz extends JPanel {

        public void paintComponent(Graphics g){
                try {
                		for(int n=1; n<250; n++) {};
                		if(n<10) {
                			var nstr = "0" + nstr.valueOf(n); 	
                		}
                		else
                		{
                			var nstr = nstr.valueOf(n); 
                		}
                        Image img = ImageIO.read(new File("JJ1_"+nstr+".PNG"));
                        g.drawImage(img, 0, 0, this);
                        //Pour une image de fond
                        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
        }               
}

