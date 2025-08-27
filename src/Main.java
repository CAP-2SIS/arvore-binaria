import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static No raiz = null;

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        int opcao;
        do {
            System.out.println("0 - sair");
            System.out.println("1 - inserir");
            System.out.println("2 - Apresenta ABB (em ordem)");
            System.out.println("Opção: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("xau");
                    break;
                case 1:
                    System.out.println("valor: ");
                    int valor = sc.nextInt();
                    raiz = insereElemento(valor, raiz);
                    break;
                case 2:
                    System.out.println("Apresentando: ");
                    emOrdem(raiz);
                    break;
                default:
                    System.out.println("Opcao invalida");

            }
        } while (opcao != 0);
    }

    private static void emOrdem(No no) {
        if (no != null){
            if (no.esq != null){
                emOrdem(no.esq);
            }
            System.out.print(no.dado +"\t");
            if (no.dir != null){
                emOrdem(no.dir);
            }
        }
    }

    private static No insereElemento(int dado, No no) {
        if (no == null){
            no = new No(dado, null,null);
        } else if (no.dado > dado){
            no.esq = insereElemento(dado, no.esq);
        } else {
            no.dir = insereElemento(dado, no.dir);
        }
        return no;
    }


}
