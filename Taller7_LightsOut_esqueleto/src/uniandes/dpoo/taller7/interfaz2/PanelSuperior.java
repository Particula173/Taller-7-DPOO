package uniandes.dpoo.taller7.interfaz2;


import javax.swing.*;
import java.awt.*;

public class PanelSuperior extends JPanel {

    public PanelSuperior() {
        setLayout(new FlowLayout());

        // Crear y agregar los elementos
        JLabel label = new JLabel("Tamaño:");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"5X5", "Opción 2", "Opción 3"});
        JLabel label1 = new JLabel("Dificultad");
        JRadioButton facil = new JRadioButton("Fácil");
        JRadioButton medio = new JRadioButton("Medio");
        JRadioButton dificil = new JRadioButton("Dificil");

        add(label);
        add(comboBox);
        add(label1);
        add(facil);
        add(medio);
        add(dificil);
    }
}
