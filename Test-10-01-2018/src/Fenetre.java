import java.awt.Dimension; 
import javax.swing.JFrame;
 
public class Fenetre extends JFrame{
  private Panneau100118 pan = new Panneau100118();

  public Fenetre(){        
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
	  Fenetre f=new Fenetre();
	  
  }
}