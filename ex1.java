package alunoaprovado;

import javax.swing.JOptionPane;


public class aluno2 {
     
    public static void main (String [] args) {
        
    int num1,num2;
  
   num1 = Integer.parseInt(JOptionPane.showInputDialog("digita o 1ª numero"));    
   
   
   num2 = Integer.parseInt(JOptionPane.showInputDialog("digita o 2ª numero"));  
   
   if(num1>num2){
    JOptionPane.showMessageDialog(null,"O maior número é o"+num1);
    
   }
   else{
       JOptionPane.showMessageDialog(null,"O maior número é o"+num2);
   }
    
    
}
}
