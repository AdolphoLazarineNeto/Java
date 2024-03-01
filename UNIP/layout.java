package UNIP;

import javax.swing.*;
import java.awt.*;

public class layout {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frameDeCadastroDeUsuario = new JFrame("Cadastro de Usuário");
        frameDeCadastroDeUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameDeCadastroDeUsuario.setSize(new Dimension(400, 300));
        JButton botaoOK = new JButton("OK");
       
        frameDeCadastroDeUsuario.setLayout(null);
        
        botaoOK.setBounds(150, 100, 100, 50);
      
        frameDeCadastroDeUsuario.add(botaoOK);
       
        frameDeCadastroDeUsuario.setVisible(true);
    }
}
