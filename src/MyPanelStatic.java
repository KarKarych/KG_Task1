import javax.swing.*;
import java.awt.*;

public class MyPanelStatic extends JPanel {
    Image vehicle;

    MyPanelStatic() {
        vehicle = new ImageIcon("horse.png").getImage();
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

        g2d.drawImage(vehicle, 10, height - 220, 463, 200, null);
    }
}