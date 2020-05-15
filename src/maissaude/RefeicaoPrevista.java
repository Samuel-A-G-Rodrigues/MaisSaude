/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author Samuel Rodrigues
 */
public class RefeicaoPrevista {
    
    private Time horRefeicao;
    private String nomRefeicao;
    private Double valCalorico;

    /**
     *
     * @param horRefeicao
     * @param nomRefeicao
     * @param valCalorico
     */
    public RefeicaoPrevista(Time horRefeicao, String nomRefeicao, Double valCalorico) {

        this.horRefeicao = horRefeicao;
        this.nomRefeicao = nomRefeicao;
        this.valCalorico = valCalorico;
    }

    /**
     * @return the horRefeicao
     */
    public Time getHorRefeicao() {
        return horRefeicao;
    }

    /**
     * @param horRefeicao the horRefeicao to set
     */
    public void setHorRefeicao(Time horRefeicao) {
        this.horRefeicao = horRefeicao;
    }

    /**
     * @return the nomRefeicao
     */
    public String getNomRefeicao() {
        return nomRefeicao;
    }

    /**
     * @param nomRefeicao the nomRefeicao to set
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
    public String toString() {
        return String.format(horRefeicao + ", " + nomRefeicao + ", " + valCalorico + ".");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.horRefeicao);
        hash = 47 * hash + Objects.hashCode(this.nomRefeicao);
        hash = 47 * hash + Objects.hashCode(this.valCalorico);
        return hash;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RefeicaoPrevista other = (RefeicaoPrevista) obj;
        if (!Objects.equals(this.horRefeicao, other.horRefeicao)) {
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
    
    
}
