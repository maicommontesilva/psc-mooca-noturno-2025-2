
import javax.swing.JOptionPane;

public class IfEncadeado {
    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno"));
        if (nota >= 7){
            JOptionPane.showMessageDialog(null,"sua" + nota +" é maior que o necessário");
        }
        else if(nota < 7 && nota >= 5 ) 
        JOptionPane.showMessageDialog(null, nota + "ta de rep paizao se fudeu");

        else{
        JOptionPane.showMessageDialog(null, nota + "ta de rep paizao se fudeu");
        
        }
    }}

