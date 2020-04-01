/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.util.Date;

public class DadosUsuario {
    private String nome;
    private Date nascimento;
    private String email;
    private String genero;
    private String telefone;
    private String senha;
    private Perfil perfilUsuario;
    
    public DadosUsuario( String nome, Date nascimento, 
            String email, String genero, String telefone, String senha){
    
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.genero = genero;
        this.telefone = telefone;
        this.senha = senha;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the nascimento
     */
    public Date getNascimento() {
        return nascimento;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
