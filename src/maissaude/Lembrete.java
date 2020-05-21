/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Havai :)
 */
public class Lembrete {

    private String nomLembrete;
    private Date data;
    private String desLembrete;
    private boolean indLembrete = false;
   //Construtores 

    /**
     *
     * @param nomLembrete
     * @param data
     * @param desLembrete
     * @param indLembrete
     */
    public Lembrete(String nomLembrete, Date data){//, String desLembrete, boolean indLembrete) {

        this.nomLembrete = nomLembrete;
        this.data = data;
        //this.desLembrete = desLembrete;
        //this.indLembrete = indLembrete;
    }
     public Lembrete(String nomLembrete, Date data, String desLembrete, boolean indLembrete) {

        this.nomLembrete = nomLembrete;
        this.data = data;
        this.desLembrete = desLembrete;
        this.indLembrete = indLembrete;
    }
//Encapsulamentos

    /**
     *
     * @return
     */
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
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nomLembrete);
        hash = 43 * hash + Objects.hashCode(this.data);
        hash = 43 * hash + Objects.hashCode(this.desLembrete);
        hash = 43 * hash + (this.indLembrete ? 1 : 0);
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
        final Lembrete other = (Lembrete) obj;
        if (this.indLembrete != other.indLembrete) {
            return false;
        }
        if (!Objects.equals(this.nomLembrete, other.nomLembrete)) {
            return false;
        }
        if (!Objects.equals(this.desLembrete, other.desLembrete)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return String.format(nomLembrete + ", " + desLembrete + ", "+ indLembrete + ".");
    }
}
