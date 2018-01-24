package jazz;
 
import java.awt.Dimension; 
import javax.swing.JFrame;

public class Fen extends JFrame{
  private Pan pan = new Pan();

  public Fen(){        
    this.setTitle("Animation");
    this.setSize((int)(640*1.5), (int)(480*1.5));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setContentPane(pan);
    this.setResizable(false);
    this.setVisible(true);
    go(); //test
  }

  private void go(){

  }  
  public static void main(String[] args) {
	  Fen f=new Fen();
	  
  }
}
