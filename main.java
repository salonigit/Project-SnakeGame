import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        GamePlay gameplay=new GamePlay();

        obj.setBounds(10,10,905,700);
        obj.setBackground(Color.darkGray);
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
}
