import java.awt.Dimension; 
import javax.swing.JFrame;
 
public class Fen_Jazz extends JFrame{
  private Pan_Jazz pan = new Pan_Jazz();

  public Fen_Jazz(){        
    this.setTitle("Animation");
    this.setSize(640*3, 480*3);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setContentPane(pan);
    this.setResizable(false);
    this.setVisible(true);
    go();
  }

  private void go(){

      //pan.repaint();  

  }  
  public static void main(String[] args) {
	  Fen_Jazz f=new Fen_Jazz();
	  
  }
}