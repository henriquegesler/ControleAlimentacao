public class carboidratos extends alimento{

    public carboidratos(String n, int vE, int c, int p, int gT, int gS, int fA, int s, int qtd){
        super(n, vE, c, p, gT, gS, fA, s);
        baseadoQuantidade = qtd;
        tipo = 1;
    }
}
