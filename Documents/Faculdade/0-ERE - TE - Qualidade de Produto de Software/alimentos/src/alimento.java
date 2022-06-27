public class alimento {
    private String nome;
    private float valorEnergetico;
    private float carboidratos;
    private float proteinas;
    private float gordurasTotais;
    private float gordurasSaturadas;
    private float baseadoQuantidade;
    private float fibraAlimentar;
    private float sodio;
    static int tipo;

    public alimento(String n, float vE, float c, float p, float gT, float gS, float fA, float s, float qtd){
        this.nome = n;
        this.valorEnergetico = vE;
        this.carboidratos = c;
        this.proteinas = p;
        this.gordurasTotais = gT;
        this.gordurasSaturadas = gS;
        this.fibraAlimentar = fA;
        this.sodio = s;
        this.baseadoQuantidade = qtd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorEnergetico(float valorEnergetico) {
        this.valorEnergetico = valorEnergetico;
    }

    public void setCarboidratos(float carboidratos) {
        this.carboidratos = carboidratos;
    }

    public void setProteinas(float proteinas) {
        this.proteinas = proteinas;
    }

    public void setGordurasTotais(float gordurasTotais) {
        this.gordurasTotais = gordurasTotais;
    }

    public void setGordurasSaturadas(float gordurasSaturadas) {
        this.gordurasSaturadas = gordurasSaturadas;
    }

    public void setFibraAlimentar(float fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    public void setSodio(float sodio) {
        this.sodio = sodio;
    }

    public void setBaseadoQuantidade(float baseadoQuantidade) {
        this.baseadoQuantidade = baseadoQuantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getValorEnergetico() {
        return valorEnergetico;
    }

    public float getCarboidratos() {
        return carboidratos;
    }

    public float getProteinas() {
        return proteinas;
    }

    public float getGordurasTotais() {
        return gordurasTotais;
    }

    public float getGordurasSaturadas() {
        return gordurasSaturadas;
    }

    public float getFibraAlimentar() {
        return fibraAlimentar;
    }

    public float getSodio() {
        return sodio;
    }

    public float getBaseadoQuantidade() {
        return baseadoQuantidade;
    }
}
