import javafx.scene.shape.Ellipse;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;

public class Town {
    void drawTown(Graphics2D g2d, int height, int width) {
        boolean flag = true;
        for (int x = 0; x < Math.ceil(width / 200.0); x++) {
            Shape line = new Rectangle.Double(x * 200, 0, 200, height);
            if (flag) {
                g2d.setColor(new Color(94, 171, 179));
                flag = false;
            } else {
                g2d.setColor(new Color(77, 148, 154));
                flag = true;
            }
            g2d.fill(line);
        }

        Shape sun = new Ellipse2D.Double(width - 175, 50, 150, 150);
        g2d.setColor(new Color(243, 191, 90));
        g2d.fill(sun);

        Shape road = new Rectangle.Double(0, height - 150, width, 150);
        g2d.setColor(new Color(125, 109, 84));
        g2d.fill(road);

        for (int x = 0; x < Math.ceil(width / 80.0); x += 2) {
            Shape roadMarking = new Rectangle.Double(x * 80, height - 85, 80, 20);
            g2d.setColor(new Color(162, 143, 112));
            g2d.fill(roadMarking);
        }

        for (int x = 0; x < Math.ceil(width / 200.0); x += 6) {
            int upperLeftPointX = x * 200 + 30;
            int upperLeftPointY = height - 375;
            Shape house1 = new Rectangle.Double(upperLeftPointX, upperLeftPointY, 140, 200);
            g2d.setColor(new Color(231, 95, 53));
            g2d.fill(house1);

            Path2D houseRoof = new Path2D.Double();
            houseRoof.moveTo(x * 200 + 100, height - 475);
            houseRoof.lineTo(upperLeftPointX, upperLeftPointY);
            houseRoof.lineTo(upperLeftPointX + 140, upperLeftPointY);
            houseRoof.closePath();
            g2d.fill(houseRoof);

            g2d.setColor(new Color(227, 245, 244));
            for (int i = 0; i < 4; i++) {
                Shape windowsHouse1 = new Rectangle.Double(upperLeftPointX + 20, upperLeftPointY + 20 + 40 * i, 40, 20);
                g2d.fill(windowsHouse1);
                windowsHouse1 = new Rectangle.Double(upperLeftPointX + 20 + 60, upperLeftPointY + 20 + 40 * i, 40, 20);
                g2d.fill(windowsHouse1);
            }
        }

        for (int x = 0; x < Math.ceil(width / 200.0); x += 6) {
            int upperLeftPointX = 200 + x * 200;
            int upperLeftPointY = height - 600;
            Shape house2 = new Rectangle.Double(upperLeftPointX, upperLeftPointY, 200, 425);
            g2d.setColor(new Color(194, 152, 68));
            g2d.fill(house2);

            Shape houseRoof2 = new RoundRectangle2D.Double(upperLeftPointX, upperLeftPointY - 50, 200, 50, 100, 100);
            Shape houseRoof2Down = new Rectangle.Double(upperLeftPointX, upperLeftPointY - 25, 200, 25);
            g2d.setColor(new Color(212, 108, 79));
            g2d.fill(houseRoof2);
            g2d.fill(houseRoof2Down);

            g2d.setColor(new Color(229, 215, 188));
            for (int i = 0; i < 10; i++) {
                Shape windowsHouse1 = new Rectangle.Double(upperLeftPointX + 12.5, upperLeftPointY + 10 + 40 * i, 50, 30);
                g2d.fill(windowsHouse1);
                windowsHouse1 = new Rectangle.Double(upperLeftPointX + 12.5 * 2 + 50, upperLeftPointY + 10 + 40 * i, 50, 30);
                g2d.fill(windowsHouse1);
                windowsHouse1 = new Rectangle.Double(upperLeftPointX + 12.5 * 3 + 50 * 2, upperLeftPointY + 10 + 40 * i, 50, 30);
                g2d.fill(windowsHouse1);
            }
        }

        for (int x = 0; x < Math.ceil(width / 200.0); x += 6) {
            int upperLeftPointX = 400 + x * 200 + 15;
            int upperLeftPointY = height - 650;
            Shape house2 = new Rectangle.Double(upperLeftPointX, upperLeftPointY, 170, 475);
            g2d.setColor(new Color(133, 118, 95));
            g2d.fill(house2);

            Shape houseRoof21 = new Rectangle.Double(upperLeftPointX + 45, upperLeftPointY - 80, 80, 80);
            Shape houseRoof22 = new Rectangle.Double(upperLeftPointX + 80, upperLeftPointY - 150, 10, 70);
            g2d.fill(houseRoof21);
            g2d.fill(houseRoof22);

            g2d.setColor(new Color(226, 207, 177));
            for (int i = 0; i < 7; i++) {
                Shape windowsHouse1 = new Rectangle.Double(upperLeftPointX, upperLeftPointY + 20 + 60 * i, 80, 50);
                g2d.fill(windowsHouse1);
                windowsHouse1 = new Rectangle.Double(upperLeftPointX + 90, upperLeftPointY + 20 + 60 * i, 80, 50);
                g2d.fill(windowsHouse1);
            }
        }

        printTree(new int[]{450, height - 175 - 300, height - 175 - 100, 625, width, height}, g2d);

        for (int x = 0; x < Math.ceil(width / 200.0); x += 6) {
            int upperLeftPointX = 600 + x * 200 + 10;
            int upperLeftPointY = height - 675;
            Shape house3 = new Rectangle.Double(upperLeftPointX, upperLeftPointY, 180, 500);
            g2d.setColor(new Color(243, 191, 90));
            g2d.fill(house3);
            g2d.setColor(new Color(230, 160, 101));
            g2d.fillPolygon(new int[]{upperLeftPointX, upperLeftPointX, upperLeftPointX + 150},
                    new int[]{upperLeftPointY, upperLeftPointY + 500, upperLeftPointY}, 3);

            g2d.setColor(new Color(145, 125, 98));
            for (int i = 0; i < 11; i++) {
                Shape windowsHouse2 = new Rectangle.Double(upperLeftPointX + 10, upperLeftPointY + 25 + 40 * i, 160, 30);
                g2d.fill(windowsHouse2);
            }
        }

        for (int x = 0; x < Math.ceil(width / 200.0); x += 6) {
            int upperLeftPointX = 800 + x * 200 + 20;
            int upperLeftPointY = height - 575;
            g2d.setColor(new Color(104, 130, 67));
            Shape house4 = new Rectangle.Double(upperLeftPointX, upperLeftPointY, 160, 400);
            g2d.fill(house4);
            house4 = new Rectangle.Double(upperLeftPointX + 20, upperLeftPointY - 70, 120, 70);
            g2d.fill(house4);
            house4 = new Rectangle.Double(upperLeftPointX + 40, upperLeftPointY - 110, 80, 40);
            g2d.fill(house4);

            g2d.setColor(new Color(255, 215, 0));
            Font font = g2d.getFont().deriveFont(80f);
            g2d.setFont(font);
            g2d.drawString("$", upperLeftPointX + 58, upperLeftPointY - 30);

            g2d.setColor(new Color(191, 208, 164));
            for (int i = 0; i < 3; i++) {
                Shape windowsHouse2 = new Rectangle.Double(upperLeftPointX + 10, upperLeftPointY + 10 + 120 * i, 40, 100);
                g2d.fill(windowsHouse2);
                windowsHouse2 = new Rectangle.Double(upperLeftPointX + 10 + 40 + 10, upperLeftPointY + 10 + 120 * i, 40, 100);
                g2d.fill(windowsHouse2);
                windowsHouse2 = new Rectangle.Double(upperLeftPointX + 10 + (40 + 10) * 2, upperLeftPointY + 10 + 120 * i, 40, 100);
                g2d.fill(windowsHouse2);
            }
        }

        for (int x = 0; x < Math.ceil(width / 200.0); x += 6) {
            int upperLeftPointX = 1000 + x * 200 + 15;
            int upperLeftPointY = height - 600;
            g2d.setColor(new Color(145, 125, 98));
            Shape house4 = new Rectangle.Double(upperLeftPointX, upperLeftPointY, 170, 425);
            g2d.fill(house4);
            g2d.fillPolygon(new int[]{upperLeftPointX, upperLeftPointX + 170, upperLeftPointX},
                    new int[]{upperLeftPointY, upperLeftPointY, upperLeftPointY - 175}, 3);

            g2d.setColor(new Color(213, 225, 252));
            for (int i = 0; i < 7; i++) {
                Shape windowsHouse2 = new Ellipse2D.Double(upperLeftPointX + 12, upperLeftPointY + 10 + 50 * i, 40, 40);
                g2d.fill(windowsHouse2);
                windowsHouse2 = new Ellipse2D.Double(upperLeftPointX + 12 + 40 + 10, upperLeftPointY + 10 + 50 * i, 40, 40);
                g2d.fill(windowsHouse2);
                windowsHouse2 = new Ellipse2D.Double(upperLeftPointX + 12 + (40 + 10) * 2, upperLeftPointY + 10 + 50 * i, 40, 40);
                g2d.fill(windowsHouse2);
            }
        }

        printTree(new int[]{1070, height - 175 - 350, height - 175 - 150, 900, width, height}, g2d);

        g2d.setColor(new Color(204, 223, 255));
        Font font = new Font("Consolas", Font.PLAIN, 19);
        g2d.setFont(font);
        String text = "В ворота гостиницы губернского города NN въехала довольно красивая рессорная небольшая бричка,\n" +
                "в какой ездят холостяки: отставные подполковники, штабс-капитаны, помещики,\nимеющие около сотни душ крестьян, – " +
                "словом, все те, которых называют господами средней руки.";
        int y = 60;
        for (String line : text.split("\n"))
            g2d.drawString(line, width / 6 - 140, y += g2d.getFontMetrics().getHeight());

        Shape roadCurb = new Rectangle.Double(0, height - 175, width, 25);
        g2d.setColor(new Color(77, 54, 19));
        g2d.fill(roadCurb);
    }

    public void printTree(int[] coordinatesTree, Graphics2D g2d) {
        for (int x = 0; x < Math.ceil(coordinatesTree[4] / 200.0); x += 6) {
            g2d.setStroke(new BasicStroke(20));
            g2d.setColor(new Color(110, 79, 35));
            g2d.drawLine(x * 200 + coordinatesTree[0], coordinatesTree[2], x * 200 + coordinatesTree[0], coordinatesTree[5] - 175);

            g2d.setColor(new Color(161, 194, 113));
            Path2D treeLeft = new Path2D.Double();
            treeLeft.moveTo(x * 200 + coordinatesTree[0], coordinatesTree[1]);
            treeLeft.lineTo(x * 200 + coordinatesTree[0], coordinatesTree[2]);
            treeLeft.curveTo(x * 200 + coordinatesTree[0], coordinatesTree[2], x * 200 + 2 * coordinatesTree[0] - coordinatesTree[3], coordinatesTree[2], x * 200 + coordinatesTree[0], coordinatesTree[1]);
            treeLeft.closePath();
            g2d.fill(treeLeft);

            g2d.setColor(new Color(127, 170, 63));
            Path2D treeRight = new Path2D.Double();
            treeRight.moveTo(x * 200 + coordinatesTree[0], coordinatesTree[1]);
            treeRight.lineTo(x * 200 + coordinatesTree[0], coordinatesTree[2]);
            treeRight.curveTo(x * 200 + coordinatesTree[0], coordinatesTree[2], x * 200 + coordinatesTree[3], coordinatesTree[2], x * 200 + coordinatesTree[0], coordinatesTree[1]);
            treeRight.closePath();
            g2d.fill(treeRight);
        }
    }
}
