/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.n.projeto1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Allyson
 */
public class Cliente{
    
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Date dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
    public String toString(){ 
        StringBuilder sb = new StringBuilder();
       
        sb.append(nome)
                .append(" - ")
                .append(cpf)
                .append(" - ")
                .append(DateUtil.dateToString(dataNascimento));
        
        return sb.toString();
    }
}
