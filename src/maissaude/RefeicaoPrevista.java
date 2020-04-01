/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.sql.Time;

/**
 *
 * @author Havai
 */
public class RefeicaoPrevista {

    private Time horRefeicao;
    private String nomRefeicao;
    private Double valCalorico;

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
}
