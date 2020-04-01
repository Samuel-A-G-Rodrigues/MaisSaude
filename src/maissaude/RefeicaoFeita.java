/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

/**
 *
 * @author Havai
 */
public class RefeicaoFeita {
    private String desRefeicao;
    private String nomRefeicao;
    private Double valCalorico;
    
        public RefeicaoFeita(String desRefeicao, String nomRefeicao, Double valCalorico) {

        this.desRefeicao = desRefeicao;
        this.nomRefeicao = nomRefeicao;
        this.valCalorico = valCalorico;
    }

    /**
     * @return the desRefeicaoF
     */
    public String getDesRefeicao() {
        return desRefeicao;
    }

    /**
     * @param desRefeicaoF the desRefeicaoF to set
     */
    public void setDesRefeicao(String desRefeicao) {
        this.desRefeicao = desRefeicao;
    }

    /**
     * @return the nomRefeicaoF
     */
    public String getNomRefeicao() {
        return nomRefeicao;
    }

    /**
     * @param nomRefeicaoF the nomRefeicaoF to set
     */
    public void setNomRefeicao(String nomRefeicao) {
        this.nomRefeicao = nomRefeicao;
    }

    /**
     * @return the valCalorico
     */
    public Double getValCalorico() {
        return valCalorico;
    }

    /**
     * @param valCalorico the valCalorico to set
     */
    @Override
    public String toString() {
        return String.format(desRefeicao + ", " + nomRefeicao + ", " + valCalorico + ".");
    }
}
