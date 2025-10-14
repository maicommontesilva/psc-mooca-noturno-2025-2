import java.awt.Container;
import java.awt.GridLayout;    
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ConversorDeTemperatura{  

    public static void criarTela(){
        System.out.println("Conversor de Temperatura");

        JFrame tela = new JFrame("Conversor De Temperatura");
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("\u00B0C");
        JButton converterButton = new JButton();
        JLabel resultadoLabel = new JLabel("Resultado");

        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2,2,4,4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(converterButton);
        painelDeConteudo.add(resultadoLabel);

        converterButton.addActionListener((e)->{
            double celsius = Double.parseDouble(celsiusTextField.getText());
            double fahrenheit = celsius / 5 *9 +32;
            resultadoLabel.setText(String.format("%.2f\u00b0F",fahrenheit));
        }
        );
    tela.pack();
    tela.setLocationRelativeTo(null);
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tela.setVisible(true);

}

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> {
            criarTela();
        }
        ); 
    }
}