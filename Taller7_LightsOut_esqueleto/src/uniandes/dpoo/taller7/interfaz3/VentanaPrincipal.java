package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    private PanelTablero panelTablero;
    private PanelSuperior panelSuperior;

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

        // Crear los paneles
        panelSuperior = new PanelSuperior();
        PanelDerecho panelDerecho = new PanelDerecho();
        PanelInferior panelInferior = new PanelInferior();
        panelTablero = new PanelTablero();

        // Agregar los paneles a la ventana principal
        add(panelSuperior, BorderLayout.NORTH);
        add(panelDerecho, BorderLayout.EAST);
        add(panelInferior, BorderLayout.SOUTH);
        add(panelTablero, BorderLayout.CENTER);

        // Añadir ActionListener al JComboBox del PanelSuperior
        panelSuperior.getComboBox().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) panelSuperior.getComboBox().getSelectedItem();
                int tamano = Integer.parseInt(selectedItem.split("X")[0]);
                panelTablero.setTamanoTablero(tamano);
            }
        });
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
