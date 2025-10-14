
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwingTella {
    public void criarTela(){

        JFrame tela = new JFrame("Hello Swing Tella");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, Swing Tella!");

        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.add(label);

        tela.pack();
        tela.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HelloSwingTella().criarTela();
        });
    }
    
}
