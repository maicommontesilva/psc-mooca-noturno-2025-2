import javax.swing.JOptionPane;

public class IfSimples{
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
        if (numero > 0){
            JOptionPane.showMessageDialog(null, "O número " + numero + "é positivo");

        }else{JOptionPane.showMessageDialog(null, "O número " + numero + " é negativo ");

            
        }

    }
}