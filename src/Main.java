import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Worker Worker1 = new Worker1();
            int option;

            Scanner in = new Scanner(System.in);
            Sabonete Sabonete1 = new Sabonete("4,99", "Cheirin", "319384", "12/04/2025", "Du bom", "Higiene", "Rosas", "Rosa");
            Bread Bread1 = new Bread("7,99", "Pão Bom", "2647892", "20/05/2024", "Caseirin", "Padaria", "Forma", false);
            Detergente Detergente1 = new Detergente("4,50", "Sujol", "13141", "23/08/2028", "Imundol", "Limpeza", "Limão");
            Suco Suco1 = new Suco("7,50", "Cajuzin", "27324", "15/04/2025", "Sucos Nat", "Bebidas", "Caju", true, "1,75L");
            Coffee Coffee1 = new Coffee("5,40", "Cafez", "757398", "12/06/2024", "Cafeito", "Cafés/Chás", "Forte", "Grande");

            System.out.println("------------------\n| MERCADO +Q BOM |\n------------------");
            System.out.println("Selecione uma opção:\n1.Ver todos os produtos\n2.Ver todos os funcionários\n3.Buscar produto por código\n4.Buscar funcionário por código");
            System.out.println(Sabonete1.getFragrance());
            System.out.println(Bread1.getBread_Type());
            System.out.println(Detergente1.getTipo_detergente());
            System.out.println(Suco1.getLitros());
            System.out.println(Worker1);

        }
    }
