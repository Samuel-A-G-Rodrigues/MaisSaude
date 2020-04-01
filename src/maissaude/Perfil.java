/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.util.Date;

public class Perfil {
    private Double altura;
    private Double peso;
    private Date dataRegistroDados;

    public Perfil(){
    
    }  
        
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
}
