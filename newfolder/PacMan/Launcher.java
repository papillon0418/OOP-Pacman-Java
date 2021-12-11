
package PacMan;
import java.awt.*;

public class Launcher {

    
    public static void main(String[] args) {
       
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
       int widthCheck = (int)size.getWidth();
       int heightCheck = (int)size.getHeight();
       Game game = new Game("PacMan !!", widthCheck, heightCheck);
        game.start();
    }
    
}


