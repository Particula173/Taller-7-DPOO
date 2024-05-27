package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class PanelDerecho extends JPanel {

    public PanelDerecho() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Crear y agregar los botones
        String[] nombresBotones = {"Nuevo", "Reiniciar", "Top 10", "Cambiar Jugador"};
        for (String nombre : nombresBotones) {
            JButton button = new JButton(nombre);
            button.setPreferredSize(new Dimension(150, 40));
            button.setMaximumSize(new Dimension(150, 40));
            button.setAlignmentX(Component.CENTER_ALIGNMENT);

            // Añadir un margen alrededor de los botones para espaciar
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
            buttonPanel.add(button);

            add(buttonPanel);
        }
    }
}
