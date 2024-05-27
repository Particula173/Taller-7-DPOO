package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class PanelTablero extends JPanel {

    private int tamanoTablero = 5; // Tamaño inicial del tablero

    public PanelTablero() {
        this.setPreferredSize(new Dimension(500, 500));

        // Establecer el color de fondo
        setBackground(Color.YELLOW);
    }

    public void setTamanoTablero(int tamano) {
        this.tamanoTablero = tamano;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();
        int cellWidth = width / tamanoTablero;
        int cellHeight = height / tamanoTablero;

        for (int i = 0; i < tamanoTablero; i++) {
            for (int j = 0; j < tamanoTablero; j++) {
                int x = i * cellWidth;
                int y = j * cellHeight;
                g2d.drawRect(x, y, cellWidth, cellHeight);
            }
        }
    }
}
