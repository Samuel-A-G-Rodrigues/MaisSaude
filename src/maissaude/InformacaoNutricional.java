/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

/**
 *
 * @author User
 */
public class InformacaoNutricional {
    private Double valInformacao;
    private String nomInformacao;

    /**
     *
     * @param valInformacao
     * @param nomInformacao
     */
    public InformacaoNutricional(Double valInformacao, String nomInformacao) {

        this.valInformacao = valInformacao;
        this.nomInformacao = nomInformacao;
    }

    /**
     * @return the valInformacao
     */
    public Double getValInformacao() {
        return valInformacao;
    }

    /**
     * @return the nomInformacao
     */
    public String getNomInformacao() {
        return nomInformacao;
    }
    

        @Override
    public String toString() {
        return String.format(valInformacao + ", " + nomInformacao + ".");
    }

    
}
