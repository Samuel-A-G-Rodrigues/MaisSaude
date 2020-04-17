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
public class Alimento {
    private String nomAlimento;
    private Double valCalorico;
    private String desAlimento;
    private Double desPeso;
    
    

    public Alimento(String nomAlimento,Double desPeso, String desAlimento, Double valCalorico) {

        this.nomAlimento = nomAlimento;
        this.desPeso = desPeso;
        this.desAlimento = desAlimento;
        this.valCalorico = valCalorico;
    }

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
    
}
