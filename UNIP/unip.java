package UNIP;

import javax.swing.*;
import java.awt.Dimension;

public class unip {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JFrame t01 = new JFrame();
        t01.setSize(new Dimension(500, 300));
        t01.setTitle("Tela Cadastro");
        t01.setLayout(null);

        JLabel lb01 = new JLabel("Código");
        lb01.setSize(50, 20);
        lb01.setLocation(20, 50);

        t01.add(lb01);

        t01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t01.setVisible(true);
    }
}
 