/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.map.projeto1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


/**
 *
 * @author Allyson
 */
public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        
        // Ler dados do teclado
        Scanner input = new Scanner(System.in);
        
        // Obter conexão
        
        // url de conexão
        // protocolo:driver://ip:porta/nome-do-banco
        String url = "jdbc:postgresql://localhost:5432/projeto1-map-n";
        String usuario = "postgres";
        String senha = "admin";
        
        Connection con = DriverManager.getConnection(url, usuario, senha);
        
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("E-mail: ");
        String email = input.nextLine();
        System.out.println("Idade: ");
        int idade = Integer.parseInt(input.nextLine());
        
        // inserir registro
        String sql = "insert into clientes (nome, email, idade) values (?,?,?)";
        
        PreparedStatement st = con.prepareStatement(sql);
        
        st.setString(1, nome);
        st.setString(2, email);
        st.setInt(3, idade);
        
        st.executeUpdate();
        
        System.out.println("Deu certo!");
        
        // liberar conexão!
        con.close();
        
    }
}
