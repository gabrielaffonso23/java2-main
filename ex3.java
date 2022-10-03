
package alunoaprovado;

import javax.swing.JOptionPane;

public class ex3 {
  
    
    public static void main (String [] args){
  
        
        
String letra;

 letra = JOptionPane.showInputDialog("digite a letra");
 
  if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || (letra.equals("u"))){

  letra  = JOptionPane.showMessageDialog("vogal");
      
}  
  else{    
  
letra = JOptionPane.showInputDialog("consoante");
}
}
}
