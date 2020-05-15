/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude.cadastros;

import maissaude.cadastros.Perfil;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ferna
 */
public class DadosUsuario {
    private String nome;
    private Date nascimento;
    private String email;
    private String genero;
    private String telefone;
    private String senha;
    private Perfil perfilUsuario;
    
    /**
     *
     * @param nome
     * @param nascimento
     * @param email
     * @param genero
     * @param telefone
     * @param senha
     */
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
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.nascimento);
        hash = 29 * hash + Objects.hashCode(this.email);
        hash = 29 * hash + Objects.hashCode(this.genero);
        hash = 29 * hash + Objects.hashCode(this.telefone);
        hash = 29 * hash + Objects.hashCode(this.senha);
        hash = 29 * hash + Objects.hashCode(this.perfilUsuario);
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DadosUsuario other = (DadosUsuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        if (!Objects.equals(this.perfilUsuario, other.perfilUsuario)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "DadosUsuario{" + "nome=" + nome + ", nascimento=" + nascimento + ", email=" + email + ", genero=" + genero + ", telefone=" + telefone + '}';
    }

}

    

