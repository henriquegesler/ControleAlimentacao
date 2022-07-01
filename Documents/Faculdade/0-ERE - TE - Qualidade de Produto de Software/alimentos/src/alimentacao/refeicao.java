package alimentacao;

import alimentacao.ingrediente;
import alimentos.*;

import java.util.ArrayList;
import java.util.List;

public class refeicao extends alimento{
    private List<ingrediente> prato;

    public refeicao(String n){
        setNome(n);
        this.prato = new ArrayList();
        setValorEnergetico(0);
        setCarboidratos(0);
        setProteinas(0);
        setGordurasTotais(0);
        setGordurasSaturadas(0);
        setFibraAlimentar(0);
        setSodio(0);
        setQuantidade(1);
    }

    public List<ingrediente> getPrato() {
        return this.prato;
    }

    public void setPrato(List<ingrediente> prato) {
        this.prato = prato;
    }

    public void addIngrediente(ingrediente i){
        this.prato.add(i);
        setValorEnergetico(this.getValorEnergetico()+i.getValorEnergetico());
        setCarboidratos(this.getCarboidratos()+i.getCarboidratos());
        setProteinas(this.getProteinas()+i.getProteinas());
        setGordurasTotais(this.getGordurasSaturadas()+i.getGordurasTotais());
        setGordurasSaturadas(this.getGordurasSaturadas()+i.getGordurasSaturadas());
        setFibraAlimentar(this.getFibraAlimentar()+i.getFibraAlimentar());
        setSodio(this.getSodio()+i.getSodio());
    }
}
