package maissaude;

import java.util.Objects;

public class AlimentoRefeicaoFeita {

    private Double quantidadeAlimento;

    public AlimentoRefeicaoFeita(Double quantidadeAlimento) {

        this.quantidadeAlimento = quantidadeAlimento;

    }

    /**
     * @return the quantidadeAlimento
     */
    public Double getQuantidadeAlimento() {
        return quantidadeAlimento;
    }

    /**
     * @param quantidadeAlimento the quantidadeAlimento to set
     */
    public void setQuantidadeAlimento(Double quantidadeAlimento) {
        this.quantidadeAlimento = quantidadeAlimento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.quantidadeAlimento);
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
        final AlimentoRefeicaoFeita other = (AlimentoRefeicaoFeita) obj;
        if (!Objects.equals(this.quantidadeAlimento, other.quantidadeAlimento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format(quantidadeAlimento + ".");
    }
}
