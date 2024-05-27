package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Establecer el título de la ventana
        setTitle("Lights Out");

        // Establecer el tamaño por defecto de la ventana
        setSize(800, 600);

        // Configurar la operación por defecto al cerrar la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

        // Configurar el layout de la ventana principal
        setLayout(new BorderLayout());

        // Agregar los paneles a la ventana principal
        add(new PanelSuperior(), BorderLayout.NORTH);
        add(new PanelDerecho(), BorderLayout.EAST);
        add(new PanelInferior(), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Usar el hilo de eventos de Swing para crear y mostrar la GUI
        SwingUtilities.invokeLater(() -> {
            // Crear una instancia de la ventana principal
            VentanaPrincipal ventana = new VentanaPrincipal();

            // Hacer visible la ventana principal
            ventana.setVisible(true);
        });
    }
}
