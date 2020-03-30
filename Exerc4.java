import javax.swing.JOptionPane;

public class Exerc4{
   public static void main(String [] args){
      int valor = 0;     
      int quantidade = 0;
      
      do{
          valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: "));
            if ((valor>=100) && (valor<=200)){
            quantidade++;
            }
      
      }while(valor!= 0);
     JOptionPane.showMessageDialog(null, "A quantidade de valores digitados é  " + quantidade);   
   }
   
}   
   