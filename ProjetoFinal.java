/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author Windows 7
 */
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
         Piso piso01 = new Piso();
       
         String[] v;
         
       piso01.pegarTXT();
       v = piso01.getPiso(0);
       System.out.println(v[1]);
      // piso01.listPisos();
       
       
          
        
    }
    
}
