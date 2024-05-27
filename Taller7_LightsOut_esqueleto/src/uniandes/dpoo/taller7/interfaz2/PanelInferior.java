package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class PanelInferior extends JPanel {

    public PanelInferior() {
        setLayout(new FlowLayout());

        // Crear y agregar los elementos
        JLabel jugadas = new JLabel("Jugadas:");
        JTextField textField = new JTextField(20);
        JLabel jugador = new JLabel("Jugador;");
        JTextField textField1 = new JTextField(20);

        add(jugadas);
        add(textField);
        add(jugador);
        add(textField1);
    }
}
