package uniandes.dpoo.taller7.interfaz2;


import javax.swing.*;
import java.awt.*;

public class PanelSuperior extends JPanel {

    public PanelSuperior() {
        setLayout(new FlowLayout());

        // Crear y agregar los elementos
        JLabel label = new JLabel("Tama�o:");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"5X5", "Opci�n 2", "Opci�n 3"});
        JLabel label1 = new JLabel("Dificultad");
        JRadioButton facil = new JRadioButton("F�cil");
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
