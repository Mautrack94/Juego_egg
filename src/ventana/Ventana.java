
package ventana;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;


public class Ventana extends Canvas {
    private final int ANCHO = 800;
    private final int ALTO = 600;
    private final String NOMBRE = "Juego";
    private JFrame ventana;
    
    public Ventana(){
        setPreferredSize(new Dimension(ANCHO, ALTO));
        ventana = new JFrame(NOMBRE);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.add(this, BorderLayout.CENTER);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
}
