package uniandes.dpoo.taller7.interfaz1;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class VentanaPrincipal extends JFrame {

    // Constructor de la ventana principal
    public VentanaPrincipal() {
        // Establecer el t�tulo de la ventana
        setTitle("Ventana Principal");

        // Configurar el tama�o por defecto de la ventana
        setSize(800, 600); // Puedes ajustar el tama�o seg�n tus necesidades

        // Establecer la operaci�n por defecto al cerrar la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
    }

    // M�todo principal para ejecutar la aplicaci�n
    public static void main(String[] args) {
        // Crear una instancia de la ventana principal
        VentanaPrincipal ventana = new VentanaPrincipal();

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}