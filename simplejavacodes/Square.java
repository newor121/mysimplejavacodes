import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class  Square extends JPanel{
    public void paint(Graphics g){
        setSize(600,600);
        g.setColor(Color.BLUE);
        g.drawLine(10,100,10,400);
        g.drawLine(10,100,400,100);
        g.drawLine(10,400,400,400);
        g.drawLine(400,400,400,100);
    }
    public static void main(String [] args){
        JFrame MainFrame=new JFrame();
        
        MainFrame.setSize(600, 600);
        
        
        Square SquarePanel =new Square();
        MainFrame.add(SquarePanel);
        MainFrame.setVisible(true);
    }
}
    
