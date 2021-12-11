package PacMan.display;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Display {
    private JFrame frame;
    private Canvas canvas;
    private String title;
    private int width,height;
    
    public Display(String title,int width,int height)
    {
        this.title = title;
        this.width = width;
        this.height = height;
        createDisplay();
    }
//    creatign simple GUI
    public void createDisplay()
    {
        frame = new JFrame("Pacman by Konoha1st");
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
//        cannot resizeable
        frame.setResizable(false);
        canvas = new Canvas();
//        setCanvaSize
        canvas.setPreferredSize(new Dimension(width,height));
        canvas.setMaximumSize(new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));
//        element on focus if not deactived krub
        canvas.setFocusable(false);
        canvas.setBackground(Color.BLACK);
        canvas.setForeground(Color.BLUE);
        frame.add(canvas);
//        for showing upper menubar
        frame.setUndecorated(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public Canvas getCanvas()
    {
        return canvas;
    }
    
    public JFrame getFrame()
    {
        return frame;
    }
}
