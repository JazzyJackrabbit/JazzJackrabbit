import java.awt.Dimension; 
import javax.swing.JFrame;
 
public class Fen_Jazz extends JFrame{
  private Pan_Jazz pan = new Pan_Jazz();

  public Fen_Jazz(){        
    this.setTitle("Animation");
<<<<<<< Updated upstream
    this.setSize(640, 480);
=======
    this.setSize(640*2, 480*2);
>>>>>>> Stashed changes
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setContentPane(pan);
    //this.setResizable(false);
    this.setVisible(true);
    go();
  } //test

  private void go(){

      //pan.repaint();  

  }  
  public static void main(String[] args) {
	  Fen_Jazz f=new Fen_Jazz();
	  
  }
}