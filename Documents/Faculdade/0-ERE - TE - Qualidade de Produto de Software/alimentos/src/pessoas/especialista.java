package pessoas;

import java.util.HashMap;
import java.util.Objects;

public class especialista extends pessoa{
    private String CRM;
    private HashMap<Integer, cliente> clientes;

    public especialista(String n, String cpf, float p, float a, String crm) {
        super(n, cpf, p, a);
        this.CRM = crm;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public cliente getCliente(int chave){
        return clientes.get(chave);
    }

    public void setCliente(int chave, cliente c){
        this.clientes.put(chave, c);
    }
}
