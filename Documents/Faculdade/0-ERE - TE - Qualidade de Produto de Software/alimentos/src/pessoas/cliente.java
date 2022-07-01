package pessoas;

public class cliente extends pessoa{
    private especialista responsavel;

    public cliente(String n, String cpf, float p, float a) {
        super(n, cpf, p, a);
    }

    public cliente(String n, String cpf, float p, float a, especialista r) {
        super(n, cpf, p, a);
        this.responsavel = r;
    }

    public especialista getResponsavel (){
        return responsavel;
    }

    public void setResponsavel(especialista r){
        this.responsavel = r;
    }
}
