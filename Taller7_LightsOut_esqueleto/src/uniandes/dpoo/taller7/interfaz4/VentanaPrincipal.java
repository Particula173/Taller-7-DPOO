package uniandes.dpoo.taller7.interfaz4;

import uniandes.dpoo.taller7.modelo.Tablero;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private PanelTablero panelTablero;
    private PanelSuperior panelSuperior;
    private PanelInferior panelInferior;
    private PanelDerecho panelDerecho;

    private Tablero tablero;

    public VentanaPrincipal() {
        // Crear el tablero
        tablero = new Tablero(5); // Tamaño inicial del tablero

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
        panelSuperior = new PanelSuperior(panelTablero);
        panelDerecho = new PanelDerecho();
        panelInferior = new PanelInferior();
        panelTablero = new PanelTablero(tablero);

        // Agregar los paneles a la ventana principal
        add(panelSuperior, BorderLayout.NORTH);
        add(panelDerecho, BorderLayout.EAST);
        add(panelInferior, BorderLayout.SOUTH);
        add(panelTablero, BorderLayout.CENTER);

        // Añadir ActionListener al JComboBox del PanelSuperior
        panelSuperior.getComboBox().addActionListener(e -> {
            String selectedItem = (String) panelSuperior.getComboBox().getSelectedItem();
            int tamano = Integer.parseInt(selectedItem.split("X")[0]);
            tablero = new Tablero(tamano);
            panelTablero.setTamanoTablero(tamano);
            panelInferior.actualizarJugadas(tablero.darJugadas());
        });

        // Añadir ActionListener al botón "Nuevo" del PanelDerecho
        panelDerecho.getNuevoButton().addActionListener(e -> {
            tablero.desordenar(10); // Ejemplo de dificultad
            panelInferior.actualizarJugadas(tablero.darJugadas());
            panelTablero.repaint();
        });

        // Añadir ActionListener al botón "Reiniciar" del PanelDerecho
        panelDerecho.getReiniciarButton().addActionListener(e -> {
            tablero.reiniciar();
            panelInferior.actualizarJugadas(tablero.darJugadas());
            panelTablero.repaint();
        });

        // Añadir ActionListener al botón "Top 10" del PanelDerecho
        panelDerecho.getTop10Button().addActionListener(e -> {
            // Lógica para mostrar el Top 10
            // Implementación pendiente
        });

        // Añadir ActionListener al botón "Cambiar Jugador" del PanelDerecho
        panelDerecho.getCambiarJugadorButton().addActionListener(e -> {
            // Lógica para cambiar de jugador
            // Implementación pendiente
        });

        // Actualizar el número de jugadas en el PanelInferior
        panelInferior.actualizarJugadas(tablero.darJugadas());
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

       
