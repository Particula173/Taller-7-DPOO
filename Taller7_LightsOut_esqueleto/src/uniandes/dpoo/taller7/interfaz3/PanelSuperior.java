package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class PanelSuperior extends JPanel {

    private JComboBox<String> comboBox;

    public PanelSuperior() {
        setLayout(new FlowLayout());

        // Crear y agregar los elementos
        JLabel label = new JLabel("Tamaño:");
        comboBox = new JComboBox<>(new String[]{"5X5", "6X6", "7X7"});
        JLabel label1 = new JLabel("Dificultad");
        JRadioButton facil = new JRadioButton("Fácil");
        JRadioButton medio = new JRadioButton("Medio");
        JRadioButton dificil = new JRadioButton("Difícil");

        add(label);
        add(comboBox);
        add(label1);
        add(facil);
        add(medio);
        add(dificil);
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }
}
