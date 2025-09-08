import javax.swing.JOptionPane;

public class SwitchCase{
    public static void main(String[] args){
        String operador = JOptionPane.showInputDialog("Insira a operação (+, -, *, /):");
        int num1 = 10, num = 5;
        int resultado;

        switch(operador){
            case "+":
                resultado = num1 + num;
                JOptionPane.showMessageDialog(null, " soma: " + resultado);
                break;

                case "-":
                resultado = num1 - num;
                JOptionPane.showMessageDialog(null, " subtração: " + resultado);
                break;
                case "*":
                resultado = num1 * num;
                JOptionPane.showMessageDialog(null, " multiplicação: " + resultado);
                break;
                case "/":
                    if(num !=0){
                resultado = num1 / num;
                JOptionPane.showMessageDialog(null, " divisão: " + resultado);
                break;
                }else{
                    System.err.println("erro:Divisão por zero");
                break;
                
            }
        }
    }
}