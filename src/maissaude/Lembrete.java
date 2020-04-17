/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.util.Date;

/**
 *
 * @author Havai :)
 */
public class Lembrete {

    private String nomLembrete;
    private Date data;
    private String desLembrete;
    private boolean indLembrete;
   //Construtores 
    public Lembrete(String nomLembrete, Date data, String desLembrete, boolean indLembrete) {

        this.nomLembrete = nomLembrete;
        this.data = data;
        this.desLembrete = desLembrete;
        this.indLembrete = indLembrete;
    }
    //Encapsulamentos
    public String getNomLembrete() {
        return nomLembrete;
    }
    
    /**
     * @param nomLembrete the nomLembrete to set
     */
    public void setNomLembrete(String nomLembrete) {
        this.nomLembrete = nomLembrete;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the desLembrete
     */
    public String getDesLembrete() {
        return desLembrete;
    }

    /**
     * @param desLembrete the desLembrete to set
     */
    public void setDesLembrete(String desLembrete) {
        this.desLembrete = desLembrete;
    }

    /**
     * @return the indLembrete
     */
    public boolean isIndLembrete() {
        return indLembrete;
    }

    /**
     * @param indLembrete the indLembrete to set
     */
    public void setIndLembrete(boolean indLembrete) {
        this.indLembrete = indLembrete;
    }
    //Metodos
    

    @Override
    public String toString() {
        return String.format(nomLembrete + ", " + desLembrete + ", "+ indLembrete + ".");
    }
}
