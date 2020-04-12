/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.util.Objects;

/**
 *
 * @author Samuel Rodrigues
 */
public class AlimentoRefeicaoPrevista {
    private Alimento alimento;
    
    public RefeicaoPrevista(Alimento alimento){
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "AlimentoRefeicaoPrevista{" + "alimento=" + alimento + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.alimento);
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
        final AlimentoRefeicaoPrevista other = (AlimentoRefeicaoPrevista) obj;
        if (!Objects.equals(this.alimento, other.alimento)) {
            return false;
        }
        return true;
    }
    
    
}
