package alunoaprovado;

import javax.swing.JOptionPane;

public class ex1 {
    
    
    public static void main (String [] args){
      
        
       int numero;
       
       
      numero = Integer.parseInt(JOptionPane.showInputDialog("digita o numero "));
       
    
      if(numero>0){
    JOptionPane.showMessageDialog(null,"O número é positivo"+numero);
    
      }
      else if (numero<0){
      JOptionPane.showMessageDialog(null,"O  número é negativo"+numero);
      } 
      else{
      JOptionPane.showMessageDialog(null,"o número e igual");
      
      }
        
        
        
      
        
        
    }
}
