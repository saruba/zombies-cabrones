
import java.awt.*;
import javax.swing.*;

/**
 * Class Principal - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Principal extends JApplet
{
    // instance variables - replace the example below with your own
    private int x;

     /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        JLabel etiqueta = new JLabel("Applet hola mundo");
		add(etiqueta);
    }
}
