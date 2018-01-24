package jazz;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
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
			for (int y = 0; y < 64; y++) {
				for (int x = 0; x < 256; x++) {
					Image img = ImageIO.read(new File("src\\IC\\1E\\" + z + ".png"));
					g.drawImage(img, x * 32, y * 32, this);
					z++; if(z>209){z=0;};
				};
			};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
