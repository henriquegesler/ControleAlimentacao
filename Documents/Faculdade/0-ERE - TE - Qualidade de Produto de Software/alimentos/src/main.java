import alimentacao.*;
import alimentos.*;
import pessoas.*;

import java.util.*;

public class main {
    private static Map<Integer, alimento> alimentos = new TreeMap();
    private static Map<String, pessoa> pessoas = new TreeMap<>();
    private static pessoa logado = null;
    public static void main(String[] args) {
        especialista adm = new especialista("Adm", "001", 81, 177, "001");
        pessoas.put(adm.getCPF(), adm);
        carboidrato carb = new carboidrato("Arroz",128.3f,28.1f,2.501f,0.201f,0.201f,1.6f,1.21f,100f);
        laticinio lat = new laticinio("Leite",82f,9.61f,6.301f,1.101f,1.101f,0f,130f,200);
        carne ovo = new carne("Ovo Frito(unidade)",78f,0.37f,5.421f,5.881f,1.635f,0f,207f,68);
        carne car = new carne("Carne",252f,0.01f,27.29f,15.01f,5.871f,0,373f,100);
        alimentos.put(1,carb);
        alimentos.put(2,lat);
        alimentos.put(3,ovo);
        alimentos.put(4,car);
        boolean end = false;
        while(!end){
            while(logado == null){
                System.out.println("Sistema de Controle Alimenticio:");
                System.out.println("1 - Login");
                System.out.println("0 - Sair");
                int primeiroMenu = teclado.lerInt();
                switch (primeiroMenu){
                    case 0:
                        end = true;
                        break;
                    case 1:
                        logado=login();
                        break;
                }
            }
            boolean endSub = false;
            while(!endSub){
                if(logado instanceof especialista){
                    System.out.println("Menu Especialista:");
                    System.out.println("1 - Listar Alimentos");
                    System.out.println("2 - Cadastrar Alimento");
                    System.out.println("3 - Remover Alimento");
                    System.out.println("4 - Criar Usuario");
                    System.out.println("0 - Sair");

                    int menu = teclado.lerInt();
                    switch (menu){
                        case 0:
                            logado = null;
                            endSub = true;
                            break;
                        case 1:
                            listarAlimentos();
                            break;
                        case 2:
                            cadastrarAlimento();
                            break;
                        case 3:
                            removerAlimento();
                            break;
                        case 4:
                            criaUsuario();
                    }
                }
                else{
                    System.out.println("Menu Cliente:");
                    System.out.println("1 - Listar Cardapios");
                    System.out.println("2 - Criar Cardapio");
                    System.out.println("0 - Sair");

                    int menu = teclado.lerInt();
                    switch (menu){
                        case 0:
                            logado = null;
                            endSub = true;
                            break;
                        case 1:
                            listarCardapio();
                            break;
                        case 2:
                            criaCardapio();
                            break;
                    }
                }
            }
        }
    }

    public static void cadastrarAlimento(){
        String n;
        int cod, t;
        float vE, c, p, gT, gS, fA, s, qtd;
        System.out.println("Qual o nome do alimento?");
        teclado.limpar();
        n = teclado.lerString();
        System.out.println("Qual o codigo do alimento?");
        cod = teclado.lerInt();
        System.out.println("Qual o peso de referencia em gramas?");
        qtd = teclado.lerFloat();
        System.out.println("Qual o valor energético em calorias?");
        vE = teclado.lerFloat();
        System.out.println("Quantidade de carboidrato em gramas?");
        c = teclado.lerFloat();
        System.out.println("Quantidade de proteina em gramas?");
        p = teclado.lerFloat();
        System.out.println("Quantidade de gorduras totais em gramas?");
        gT = teclado.lerFloat();
        System.out.println("Quantidade de gorduras saturadas em gramas?");
        gS = teclado.lerFloat();
        System.out.println("Qual o valor da fibra alimentar em gramas?");
        fA = teclado.lerFloat();
        System.out.println("Quantidade de sodio em miligramas?");
        s = teclado.lerFloat();
        System.out.println("Qual o tipo do alimento?");
        System.out.println("1 - Carboidrato");
        System.out.println("2 - Fruta");
        System.out.println("3 - Hortalica");
        System.out.println("4 - Laticinio");
        System.out.println("5 - Carne");
        System.out.println("6 - Leguminosa");
        System.out.println("7 - Gordura");
        System.out.println("8 - Acucar");
        t = teclado.lerInt();
        switch (t){
            case 1:
                carboidrato carb = new carboidrato(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.put(cod, carb);
                break;
            case 2:
                fruta fru = new fruta(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.put(cod, fru);
                break;
            case 3:
                hortalica hort = new hortalica(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.put(cod, hort);
                break;
            case 4:
                laticinio lat = new laticinio(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.put(cod, lat);
                break;
            case 5:
                carne car = new carne(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.put(cod, car);
                break;
            case 6:
                leguminosa leg = new leguminosa(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.put(cod, leg);
                break;
            case 7:
                gordura gord = new gordura(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.put(cod, gord);
                break;
            case 8:
                acucar acu = new acucar(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.put(cod, acu);
                break;
        }
    }

    public static void listarAlimentos(){
        if(alimentos.size()>0){
            System.out.println("Codigo\tTipo\tRef(g/ml)\tValorEnergetico(cal)\tCarb(g)\t\tProt(g)\t\tGordTotais(g)\t" +
                    "GordSat(g)\tFibraAlim(g)\tSodio(mg)\tNome");
            for (Integer chave : alimentos.keySet()) {
                System.out.println(chave + "\t\t" + alimentos.get(chave).getTipo() + "\t\t" +
                        + alimentos.get(chave).getQuantidade() + "\t\t" +
                        + alimentos.get(chave).getValorEnergetico() + "\t\t\t\t\t" +
                        + alimentos.get(chave).getCarboidratos() + "\t\t" +
                        + alimentos.get(chave).getProteinas() + "\t\t" +
                        + alimentos.get(chave).getGordurasTotais() + "\t\t\t" +
                        + alimentos.get(chave).getGordurasSaturadas() + "\t\t" +
                        + alimentos.get(chave).getFibraAlimentar() + "\t\t\t\t" +
                        + alimentos.get(chave).getSodio() + "\t\t" + alimentos.get(chave).getNome());
            }
        } else{
            System.out.println("Lista vazia.");
        }

    }

    public static void removerAlimento() {
        int i;
        System.out.println("Digite o codigo do alimento que deseja remover: (caso deseje ver a lista" +
                ", digite 0)");
        i = teclado.lerInt();
        if (i == 0) {
            listarAlimentos();
            removerAlimento();
        } else {
            alimentos.remove(i);
        }
    }

    public static refeicao criaRefeicao(){
        int chave;
        float qtd;
        String s;
        boolean end = false;
        System.out.println("Escolha um nome para o prato, em seguida mostraremos a lista dos alimentos cadastrados.");
        System.out.println("Digite o nome do prato:");
        s = teclado.lerString();
        refeicao r = new refeicao(s);
        while(!end){
            listarAlimentos();
            System.out.println("Escolha o codigo do alimento que deseja adicionar: (escolha 0 para sair)");
            chave = teclado.lerInt();
            if(chave==0){
                end = true;
            } else{
                System.out.println("Digite o peso em gramas ou ml do alimento utilizado:");
                qtd = teclado.lerFloat();
                ingrediente i = new ingrediente(alimentos.get(chave),qtd);
                r.addIngrediente(i);
                System.out.println("Deseja adicionar mais ingredientes no prato? s/n");
                teclado.limpar();
                s = teclado.lerString();
                if (s.equalsIgnoreCase("n") || s.equalsIgnoreCase("nao")){
                    end = true;
                }
            }
        }
        return r;
    }

    public static void criaCardapio(){
        String s;
        boolean end = false;
        dieta c = new dieta();
        System.out.println("Voce pode adicionar pratos a uma refeicao já existente ou criar uma nova.");
        System.out.println("Os nomes das refeicoes sao unicos. Caso digite um nome ja existente, " +
                "o prato sera adicionado a ela.");
        System.out.println("Digite o nome da alimentacao.refeicao: (ex.: cafe da manha, almoco, etc)");
        teclado.limpar();
        s = teclado.lerString();
        while(!end){
            System.out.println("Siga as instrucoes para adicionar uma opcao de prato.");
            logado.getAlimentacao().addRefeicao(s, criaRefeicao());
            System.out.println("Deseja adicionar mais uma opcao de prato? s/n");
            s = teclado.lerString();
            if (s.equalsIgnoreCase("n") || s.equalsIgnoreCase("nao")){
                end = true;
            }
        }
    }


    public static void listarCardapio(){
        dieta alim;
        if(logado.getAlimentacao().getCardapio().size()>0){
            System.out.println("NomeRefeicao\tNomePrato\tValorEnergetico(cal)\tCarb(g)\t\tProt(g)\t\tGordTotais(g)\t" +
                    "GordSat(g)\tFibraAlim(g)\tSodio(mg)");
            for (String chave : logado.getAlimentacao().getCardapio().keySet()) {
                alim = logado.getAlimentacao();
                for (int i=0; i< alim.getCardapio().get(chave).size(); i++){
                    System.out.println(chave + "\t\t" + alim.getCardapio().get(chave).get(i).getNome() + "\t\t" +
                            + alim.getCardapio().get(chave).get(i).getValorEnergetico() + "\t\t\t\t\t" +
                            + alim.getCardapio().get(chave).get(i).getCarboidratos() + "\t\t" +
                            + alim.getCardapio().get(chave).get(i).getProteinas() + "\t\t" +
                            + alim.getCardapio().get(chave).get(i).getGordurasTotais() + "\t\t\t" +
                            + alim.getCardapio().get(chave).get(i).getGordurasSaturadas() + "\t\t" +
                            + alim.getCardapio().get(chave).get(i).getFibraAlimentar() + "\t\t\t\t" +
                            + alim.getCardapio().get(chave).get(i).getSodio());
                }

            }
        } else{
            System.out.println("Lista vazia.");
        }
    }

    public static void criaUsuario(){
        String n, cpf, s;
        float p, a;
        System.out.println("Digite o nome do novo usuario:");
        teclado.limpar();
        n = teclado.lerString();
        System.out.println("Digite o CPF do novo usuario:");
        cpf = teclado.lerString();
        System.out.println("Digite o peso do novo usuario:");
        p = teclado.lerFloat();
        System.out.println("Digite a altura do novo usuario:");
        a = teclado.lerFloat();
        System.out.println("O usuario eh um administrador?");
        teclado.limpar();
        s = teclado.lerString();
        if (s.equalsIgnoreCase("s") || s.equalsIgnoreCase("sim")){
            String crm;
            System.out.println("Digite o CRM do novo administrador:");
            crm = teclado.lerString();
            especialista esp = new especialista(n, cpf, p, a, crm);
            pessoas.put(cpf,esp);
        } else{
            String resp;
            System.out.println("Digite o CPF do especialista responsavel pelo cliente:");
            resp = teclado.lerString();
            cliente cli = new cliente(n, cpf, p, a);
            if(pessoas.containsKey(resp)){
                cli.setResponsavel((especialista) pessoas.get(resp));
            }
            else{
                System.out.println("Esse especialista nao existe, nenhum especialista sera adicionado" +
                        "a esse cliente.");
            }
            pessoas.put(cpf,cli);
        }
    }

    public static pessoa login(){
        String cpf;
        System.out.println("Digite o CPF do usuario que deseja logar:");
        teclado.limpar();
        cpf = teclado.lerString();
        if(pessoas.containsKey(cpf)){
            return pessoas.get(cpf);
        }
        else{
            System.out.println("Usuario invalido.");
            return null;
        }
    }
}