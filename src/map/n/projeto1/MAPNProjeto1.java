/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.n.projeto1;

/**
 *
 * @author Allyson
 */
public class MAPNProjeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c = new Cliente();

        c.setNome("Allyson");
        c.setEmail("allysonjeronimo@gmail.com");
        
        System.out.println(c.toString());
    }
    
}
