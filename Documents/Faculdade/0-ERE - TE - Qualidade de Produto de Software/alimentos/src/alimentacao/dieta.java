package alimentacao;

import alimentos.*;

import java.util.*;

public class dieta extends alimento{
    private List<refeicao> opcoes;
    private Map<String, List<refeicao>> cardapio;

    public dieta(){
        cardapio = new HashMap<>();
    }

    public void addRefeicao(String chave, refeicao r) {
        opcoes = new ArrayList<>();
        cardapio.putIfAbsent(chave,opcoes);
        cardapio.get(chave).add(r);
    }

    public List<refeicao> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(List<refeicao> opcoes) {
        this.opcoes = opcoes;
    }

    public Map<String, List<refeicao>> getCardapio() {
        return cardapio;
    }

    public void setCardapio(Map<String, List<refeicao>> cardapio) {
        this.cardapio = cardapio;
    }
}

