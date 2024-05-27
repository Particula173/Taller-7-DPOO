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
        tablero = new Tablero(5); // Tama�o inicial del tablero

        // Establecer el t�tulo de la ventana
        setTitle("Lights Out");

        // Establecer el tama�o por defecto de la ventana
        setSize(800, 600);

        // Configurar la operaci�n por defecto al cerrar la ventana
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

        // A�adir ActionListener al JComboBox del PanelSuperior
        panelSuperior.getComboBox().addActionListener(e -> {
            String selectedItem = (String) panelSuperior.getComboBox().getSelectedItem();
            int tamano = Integer.parseInt(selectedItem.split("X")[0]);
            tablero = new Tablero(tamano);
            panelTablero.setTamanoTablero(tamano);
            panelInferior.actualizarJugadas(tablero.darJugadas());
        });

        // A�adir ActionListener al bot�n "Nuevo" del PanelDerecho
        panelDerecho.getNuevoButton().addActionListener(e -> {
            tablero.desordenar(10); // Ejemplo de dificultad
            panelInferior.actualizarJugadas(tablero.darJugadas());
            panelTablero.repaint();
        });

        // A�adir ActionListener al bot�n "Reiniciar" del PanelDerecho
        panelDerecho.getReiniciarButton().addActionListener(e -> {
            tablero.reiniciar();
            panelInferior.actualizarJugadas(tablero.darJugadas());
            panelTablero.repaint();
        });

        // A�adir ActionListener al bot�n "Top 10" del PanelDerecho
        panelDerecho.getTop10Button().addActionListener(e -> {
            // L�gica para mostrar el Top 10
            // Implementaci�n pendiente
        });

        // A�adir ActionListener al bot�n "Cambiar Jugador" del PanelDerecho
        panelDerecho.getCambiarJugadorButton().addActionListener(e -> {
            // L�gica para cambiar de jugador
            // Implementaci�n pendiente
        });

        // Actualizar el n�mero de jugadas en el PanelInferior
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

       
