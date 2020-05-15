/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.util.Objects;

/**
 *
 * @author Diogo
 */
public class RefeicaoFeita {

    private String desRefeicao;
    private String nomRefeicao;
    private Double valCalorico;

    /**
     *
     * @param desRefeicao
     * @param nomRefeicao
     * @param valCalorico
     */
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
     * @param desRefeicao
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
     * @param nomRefeicao
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.desRefeicao);
        hash = 17 * hash + Objects.hashCode(this.nomRefeicao);
        hash = 17 * hash + Objects.hashCode(this.valCalorico);
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
        final RefeicaoFeita other = (RefeicaoFeita) obj;
        if (!Objects.equals(this.desRefeicao, other.desRefeicao)) {
            return false;
        }
        if (!Objects.equals(this.nomRefeicao, other.nomRefeicao)) {
            return false;
        }
        if (!Objects.equals(this.valCalorico, other.valCalorico)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format(desRefeicao + ", " + nomRefeicao + ", " + valCalorico + ".");
    }
}
