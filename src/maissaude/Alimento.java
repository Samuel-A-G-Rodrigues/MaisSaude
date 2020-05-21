/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Alimento {
    private String nomAlimento;
    private Double valCalorico;
    private String desAlimento;
    private Double desPeso;
    
    
    //Metódo construtor, onde se atribuir as informações digitadas pelo usuário

    /**
     *
     * @param nomAlimento
     * @param desPeso
     * @param desAlimento
     * @param valCalorico
     */
    public Alimento(String nomAlimento,Double desPeso, String desAlimento, Double valCalorico) {

        this.nomAlimento = nomAlimento;
        this.desPeso = desPeso;
        this.desAlimento = desAlimento;
        this.valCalorico = valCalorico;
    }

    /**
     *
     * @return
     */
    public String getNomAlimento() {
        return nomAlimento;
    }

    /**
     * @param nomAlimento the nomAlimento to set
     */
    public void setNomAlimento(String nomAlimento) {
        this.nomAlimento = nomAlimento;
    }

    /**
     * @return the valCalorico
     */
    //
    public Double getValCalorico() {
        return valCalorico;
    }
    /**
     * @return the desAlimento
     */
    public String getDesAlimento() {
        return desAlimento;
    }

    /**
     * @param desAlimento the desAlimento to set
     */
    public void setDesAlimento(String desAlimento) {
        this.desAlimento = desAlimento;
    }

    /**
     * @return the desPeso
     */
    public Double getDesPeso() {
        return desPeso;
    }

    /**
     * @param desPeso the desPeso to set
     */
    public void setDesPeso(Double desPeso) {
        this.desPeso = desPeso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nomAlimento);
        hash = 59 * hash + Objects.hashCode(this.desPeso);
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
        final Alimento other = (Alimento) obj;
        if (!Objects.equals(this.nomAlimento, other.nomAlimento)) {
            return false;
        }
        if (!Objects.equals(this.desPeso, other.desPeso)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alimento{" + "nomAlimento=" + nomAlimento + ", valCalorico=" + valCalorico + ", desAlimento=" + desAlimento + ", desPeso=" + desPeso + '}';
    }
    
    
}
