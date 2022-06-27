import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static ArrayList<alimento> alimentos = new ArrayList();
    private static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        boolean end = false;
        while(!end){
            System.out.println("Menu:");
            System.out.println("1 - Listar Alimentos");
            System.out.println("2 - Cadastrar Alimento");
            System.out.println("3 - Remover Alimento");
            System.out.println("0 - Sair");

            int menu = ler.nextInt();
            switch (menu){
                case 0:
                    end = true;
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
            }
        }
    }

    public static void cadastrarAlimento(){
        String n;
        int t;
        float vE, c, p, gT, gS, fA, s, qtd;
        System.out.println("Qual o nome do alimento?");
        n = ler.next();
        System.out.println("Qual o peso de referencia em kg?");
        qtd= ler.nextFloat();
        System.out.println("Qual o valor energético?");
        vE = ler.nextFloat();
        System.out.println("Quantidade de carboidrato?");
        c = ler.nextFloat();
        System.out.println("Quantidade de proteina?");
        p = ler.nextFloat();
        System.out.println("Quantidade de gorduras totais?");
        gT = ler.nextFloat();
        System.out.println("Quantidade de gorduras saturadas?");
        gS = ler.nextFloat();
        System.out.println("Qual o valor da fibra alimentar?");
        fA = ler.nextFloat();
        System.out.println("Quantidade de sodio?");
        s = ler.nextFloat();
        System.out.println("Qual o tipo do alimento?");
        System.out.println("1 - Carboidrato");
        System.out.println("2 - Fruta");
        System.out.println("3 - Hortalica");
        System.out.println("4 - Laticinio");
        System.out.println("5 - Carne");
        System.out.println("6 - Leguminosa");
        System.out.println("7 - Gordura");
        System.out.println("8 - Acucar");
        t = ler.nextInt();
        switch (t){
            case 1:
                carboidrato carb = new carboidrato(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.add(carb);
                break;
            case 2:
                fruta fru = new fruta(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.add(fru);
                break;
            case 3:
                hortalica hort = new hortalica(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.add(hort);
                break;
            case 4:
                laticinio lat = new laticinio(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.add(lat);
                break;
            case 5:
                carne car = new carne(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.add(car);
                break;
            case 6:
                leguminosa leg = new leguminosa(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.add(leg);
                break;
            case 7:
                gordura gord = new gordura(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.add(gord);
                break;
            case 8:
                acucar acu = new acucar(n,vE,c,p,gT,gS,fA,s,qtd);
                alimentos.add(acu);
                break;
        }
    }

    public static void listarAlimentos(){
        System.out.println("Codigo \t Nome");
        for (int tam = 0; tam < alimentos.size(); tam++) {
            int t = tam + 1;
            System.out.println(t + "\t\t" + alimentos.get(tam).getNome());
        }
    }

    public static void removerAlimento() {
        int i;
        System.out.println("Digite o numero do alimento que deseja remover: (caso deseje ver a lista" +
                ", digite 0)");
        i = ler.nextInt();
        if (i == 0) {
            listarAlimentos();
            removerAlimento();
        } else {
            i--;
            alimentos.remove(i);
        }
    }

}