package alimentacao;

import alimentos.alimento;

public class ingrediente extends alimento{
    private alimento comida;
    private float fator;

    public ingrediente(){

    }

    public ingrediente(alimento c, float q) {
        this.fator = (q/c.getQuantidade());
        setQuantidade(q);
        setNome(c.getNome());
        setValorEnergetico(c.getValorEnergetico()*fator);
        setCarboidratos(c.getCarboidratos()*fator);
        setProteinas(c.getProteinas()*fator);
        setGordurasTotais(c.getGordurasTotais()*fator);
        setGordurasSaturadas(c.getGordurasSaturadas()*fator);
        setFibraAlimentar(c.getFibraAlimentar()*fator);
        setSodio(c.getSodio()*fator);
    }
}
