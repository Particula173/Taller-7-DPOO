package uniandes.dpoo.taller7.interfaz4;

import uniandes.dpoo.taller7.modelo.Tablero;

import javax.swing.*;
import java.awt.*;

public class PanelTablero extends JPanel {

    private int tamanoTablero = 5; // Tamaño inicial del tablero
    private Tablero tablero;

    public PanelTablero(Tablero tablero) {
        this.tablero = tablero;
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

        boolean[][] estadoTablero = tablero.darTablero();

        for (int i = 0; i < tamanoTablero; i++) {
            for (int j = 0; j < tamanoTablero; j++) {
                int x = i * cellWidth;
                int y = j * cellHeight;
                if (estadoTablero[i][j]) {
                    g2d.setColor(Color.WHITE);
                } else {
                    g2d.setColor(Color.BLACK);
                }
                g2d.fillRect(x, y, cellWidth, cellHeight);
                g2d.setColor(Color.GRAY);
                g2d.drawRect(x, y, cellWidth, cellHeight);
            }
        }
    }
}
