import javax.swing.JOptionPane;

public class Exerc3{
   public static void main (String [] args)
   {
      double cont = 0;
      double soma = 0;
      double num  ;
      
      do{
              num = Double.parseDouble(JOptionPane.showInputDialog(" Digite o numero: "));
               if (num == 0){ 
           
            } else{
              soma = num + soma;
              cont++;
              }
      
      }while (num != 0);
         JOptionPane.showMessageDialog(null," a média é = " + soma/ cont);
   }
   
}   
   
