import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame {
    MyPanel panel;
    MyPanelStatic panelStatic;

    MyFrame() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        panel = new MyPanel();
        //panelStatic = new MyPanelStatic();

        Clip clip = AudioSystem.getClip();
        //clip.open(AudioSystem.getAudioInputStream(new File("Garmarna - Herr Mannelig.wav")));
        clip.open(AudioSystem.getAudioInputStream(new File("pig.wav")));
        clip.loop(Clip.LOOP_CONTINUOUSLY);

        setPreferredSize(new Dimension(1215, 1000));
        setTitle("Peter's town");
        setTitle("This town");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        add(panel);
        //add(panelStatic);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}