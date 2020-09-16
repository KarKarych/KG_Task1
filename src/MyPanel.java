import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {
    int index;
    int road;
    Image vehicle;
    int xVelocity = 1;
    int x = 0;

    MyPanel() {
        vehicle = new ImageIcon("pigPeter.png").getImage();
        Timer timer = new Timer(1, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        new Town().drawTown(g2d, height, width);

        //g2d.drawImage(vehicle, 10 + x, this.road, 463 * index, 200, null);
        g2d.drawImage(vehicle, 10 + x, this.road, 200 * index, 200, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= this.getWidth()) {
            index = -1;
            xVelocity = xVelocity * -1;
            road = this.getHeight() - 310;
        } else if (x < 0) {
            index = 1;
            xVelocity = xVelocity * -1;
            road = this.getHeight() - 220;
        }
        x = x + xVelocity;
        repaint();
    }
}