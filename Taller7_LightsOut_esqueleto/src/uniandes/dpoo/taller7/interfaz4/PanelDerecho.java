package uniandes.dpoo.taller7.interfaz4;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelDerecho extends JPanel {

    private JButton nuevoButton;
    private JButton reiniciarButton;
    private JButton top10Button;
    private JButton cambiarJugadorButton;

    public PanelDerecho() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Crear y agregar los botones
        nuevoButton = new JButton("Nuevo");
        reiniciarButton = new JButton("Reiniciar");
        top10Button = new JButton("Top 10");
        cambiarJugadorButton = new JButton("Cambiar Jugador");

        nuevoButton.setPreferredSize(new Dimension(150, 40));
        nuevoButton.setMaximumSize(new Dimension(150, 40));
        nuevoButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        reiniciarButton.setPreferredSize(new Dimension(150, 40));
        reiniciarButton.setMaximumSize(new Dimension(150, 40));
        reiniciarButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        top10Button.setPreferredSize(new Dimension(150, 40));
        top10Button.setMaximumSize(new Dimension(150, 40));
        top10Button.setAlignmentX(Component.CENTER_ALIGNMENT);

        cambiarJugadorButton.setPreferredSize(new Dimension(150, 40));
        cambiarJugadorButton.setMaximumSize(new Dimension(150, 40));
        cambiarJugadorButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir un margen alrededor de los botones para espaciar
        JPanel nuevoButtonPanel = new JPanel();
        nuevoButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        nuevoButtonPanel.add(nuevoButton);

        JPanel reiniciarButtonPanel = new JPanel();
        reiniciarButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        reiniciarButtonPanel.add(reiniciarButton);

        JPanel top10ButtonPanel = new JPanel();
        top10ButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        top10ButtonPanel.add(top10Button);

        JPanel cambiarJugadorButtonPanel = new JPanel();
        cambiarJugadorButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        cambiarJugadorButtonPanel.add(cambiarJugadorButton);

        add(nuevoButtonPanel);
        add(reiniciarButtonPanel);
        add(top10ButtonPanel);
        add(cambiarJugadorButtonPanel);
    }

    public JButton getNuevoButton() {
        return nuevoButton;
    }

    public JButton getReiniciarButton() {
        return reiniciarButton;
    }

    public JButton getTop10Button() {
        return top10Button;
    }

    public JButton getCambiarJugadorButton() {
        return cambiarJugadorButton;
    }
}
