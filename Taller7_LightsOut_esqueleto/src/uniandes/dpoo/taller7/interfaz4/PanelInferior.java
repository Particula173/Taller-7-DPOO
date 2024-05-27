package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;

public class PanelInferior extends JPanel {

    private JTextField jugadasTextField;
    private JTextField jugadorTextField;

    public PanelInferior() {
        setLayout(new FlowLayout());

        // Crear y agregar los elementos
        JLabel jugadas = new JLabel("Jugadas:");
        jugadasTextField = new JTextField(20);
        jugadasTextField.setEditable(false); // El campo no es editable
        JLabel jugador = new JLabel("Jugador:");
        jugadorTextField = new JTextField(20);

        add(jugadas);
        add(jugadasTextField);
        add(jugador);
        add(jugadorTextField);
    }

    // Método para actualizar el número de jugadas en el JTextField
    public void actualizarJugadas(int numeroJugadas) {
        jugadasTextField.setText(String.valueOf(numeroJugadas));
    }
}
