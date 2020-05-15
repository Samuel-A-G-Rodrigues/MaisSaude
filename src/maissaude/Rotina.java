/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Havai
 */
public class Rotina {

    private int valorCalorico;
    private Double numMeta;
    private boolean metaAlcancada;

    /**
     * @param valorCalorico
     * @param metaAlcancada
     * @param numMeta
     */
    public Rotina(int valorCalorico, double numMeta, boolean metaAlcancada) {

        this.valorCalorico = valorCalorico;
        this.numMeta = numMeta;
        this.metaAlcancada = metaAlcancada;
    }

    /**
     *
     * @return
     */
    public int getValorCalorico() {
        return valorCalorico;
    }

    /**
     * @param valorCalorico the valorCalorico to set
     */
    public void setValorCalorico(int valorCalorico) {
        this.valorCalorico = valorCalorico;
    }

    /**
     * @return the numMeta
     */
    public Double getNumMeta() {
        return numMeta;
    }

    /**
     * @param numMeta the numMeta to set
     */
    public void setNumMeta(Double numMeta) {
        this.numMeta = numMeta;
    }

    /**
     * @return the metaAlcancada
     */
    public boolean isMetaAlcancada() {
        return metaAlcancada;
    }

    /**
     * @param metaAlcancada the metaAlcancada to set
     */
    public void setMetaAlcancada(boolean metaAlcancada) {
        this.metaAlcancada = metaAlcancada;
    }

    //Metodos
    //

    /**
     *
     * @param nomLembrete
     * @param data
     * @param desLembrete
     * @return
     */
    public String cadastrarLembrete(String nomLembrete, Date data, String desLembrete) {
        Lembrete lembrete = new Lembrete(nomLembrete, data, desLembrete, false);
        return lembrete.toString();
    }

    /**
     *
     * @param horRefeicao
     * @param nomRefeicao
     * @param valCalorico
     * @return
     */
    public String cadastrarRefeicaoPrevista(Time horRefeicao, String nomRefeicao, Double valCalorico) {
        RefeicaoPrevista refeicao = new RefeicaoPrevista(horRefeicao, nomRefeicao, valCalorico);
        return refeicao.toString();
    }

    /**
     *
     * @param desRefeicao
     * @param nomRefeicao
     * @param valCalorico
     * @return
     */
    public String cadastrarRefeicaoFeita(String desRefeicao, String nomRefeicao, Double valCalorico) {
        RefeicaoFeita refeicao = new RefeicaoFeita(desRefeicao, nomRefeicao, valCalorico);
        return refeicao.toString();
    }

    /**
     *
     * @param valInformacao
     * @param nomInformacao
     * @return
     */
    public String informacaoNutricional(Double valInformacao, String nomInformacao) {
        InformacaoNutricional infoNutricional = new InformacaoNutricional(valInformacao, nomInformacao);
        return infoNutricional.toString();
    }

    @Override
    public String toString() {
        return String.format(numMeta + ", " + metaAlcancada + ", ");
    }
    
}
