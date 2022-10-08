
package teste;

import javax.swing.JOptionPane;



public class teste {
    
     public static void main(String[] args){
     
     String nome;
         
     Double valohr,salbruto,imposto,inss,trabalhohoras,liquido;
     
      
     nome = JOptionPane.showInputDialog("digite Nome do fucionario");
   
     valohr = Double.parseDouble(JOptionPane.showInputDialog("digite valor pela hora"));
      
     trabalhohoras = Double.parseDouble(JOptionPane.showInputDialog("digite valor pela trabalhohoras"));
 
    salbruto = valohr * trabalhohoras;
    
  if(salbruto<=1903.98){  
   inss = 7.5 * salbruto;
   
   else(salbruto<=1903.99){
      
 
    
   
  }
            
  }
  
    JOptionPane.showMessageDialog(null,"valor total"+salbruto);
   
 
}
}
