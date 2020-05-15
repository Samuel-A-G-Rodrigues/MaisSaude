/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude.cadastros;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ferna
 */
public class Perfil {
    private Double altura;
    private Double peso;
    private Date dataRegistroDados;
    private DadosUsuario dados_usuarios;

    /**
     *
     */
    public Perfil(){
    
    }  
        
    /**
     *
     * @param altura
     * @param peso
     * @param dataRegistroDados
     */
    public Perfil(Double altura, Double peso, Date dataRegistroDados){
        this.altura = altura;
        this.peso = peso;
        this.dataRegistroDados = dataRegistroDados;
    }   

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the dataRegistroDados
     */
    public Date getDataRegistroDados() {
        return dataRegistroDados;
    }

    /**
     * @param dataRegistroDados the dataRegistroDados to set
     */
    public void setDataRegistroDados(Date dataRegistroDados) {
        this.dataRegistroDados = dataRegistroDados;
    }
    
    @Override
    public String toString() { 
        return String.format(getAltura() + ", " + getPeso() + ", " + getDataRegistroDados()+"."); 
    }
     @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.altura);
        hash = 37 * hash + Objects.hashCode(this.peso);
        hash = 37 * hash + Objects.hashCode(this.dataRegistroDados);
        hash = 37 * hash + Objects.hashCode(this.dados_usuarios);
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
        final Perfil other = (Perfil) obj;
        if (!Objects.equals(this.altura, other.altura)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.dataRegistroDados, other.dataRegistroDados)) {
            return false;
        }
        if (!Objects.equals(this.dados_usuarios, other.dados_usuarios)) {
            return false;
        }
        return true;
    }
}
