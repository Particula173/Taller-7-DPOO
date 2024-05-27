package uniandes.dpoo.taller7.interfaz1;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class VentanaPrincipal extends JFrame {

    // Constructor de la ventana principal
    public VentanaPrincipal() {
        // Establecer el título de la ventana
        setTitle("Ventana Principal");

        // Configurar el tamaño por defecto de la ventana
        setSize(800, 600); // Puedes ajustar el tamaño según tus necesidades

        // Establecer la operación por defecto al cerrar la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        // Crear una instancia de la ventana principal
        VentanaPrincipal ventana = new VentanaPrincipal();

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}