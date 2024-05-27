package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSuperior extends JPanel {

    private JComboBox<String> comboBox;

    public PanelSuperior(PanelTablero panelTablero) {
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

        // Añadir ActionListener al JComboBox del PanelSuperior
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                int tamano = Integer.parseInt(selectedItem.split("X")[0]);
                panelTablero.setTamanoTablero(tamano);
            }
        });
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }
}
