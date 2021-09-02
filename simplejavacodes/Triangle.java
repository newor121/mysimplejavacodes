import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class  Triangle extends JPanel{
    public void paint(Graphics g){
        setSize(600,600);
        g.setColor(Color.BLUE);
        g.drawLine(250,100,80,400);
        g.drawLine(250,100,400,400);
        g.drawLine(80,400,400,400);
     
    }
    public static void main(String [] args){
        JFrame MainFrame=new JFrame();
        
        MainFrame.setSize(600, 600);
        
        
        Triangle TrianglePanel =new Triangle();
        MainFrame.add(TrianglePanel);
        MainFrame.setVisible(true);
    }
}