/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.n.projeto1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Allyson
 */
public class MAPNProjeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        ArrayList<Cliente> lista = new ArrayList<>();
        String op;

        do {
            
            System.out.println("----MENU----");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - EDITAR");
            System.out.println("3 - EXCLUIR");
            System.out.println("4 - CONSULTAR");
            System.out.println("0 - SAIR");

            op = input.nextLine();

            System.out.println("Opção selecionada: " + op);
            
            if(op.equals("1")){
                
                System.out.println("---CADASTRAR----");
                
                Cliente c = new Cliente();
                
                System.out.println("Nome: ");
                c.setNome(input.nextLine());
                System.out.println("CPF: ");
                c.setCpf(input.nextLine());
                System.out.println("Data de Nascimento: ");
                c.setDataNascimento(DateUtil.stringToDate(input.nextLine()));
                
                lista.add(c);
                
                System.out.println("Registro salvo com sucesso!");
            }
            else if(op.equals("4")){
                System.out.println("----CONSULTAR----");
                
                for(Cliente c : lista){
                    System.out.println(c);
                }
            }
        } while (!op.equals("0"));

    }

}
