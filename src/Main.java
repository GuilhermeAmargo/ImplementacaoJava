import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Worker Worker1 = new Worker1(); // Funcionário 1
            Worker Worker2 = new Worker2(); // Funcionário 2
            Worker Worker3 = new Worker3(); // Funcionário 3
            Worker Worker4 = new Worker4(); // Funcionário 4

            int option, search;

            Scanner in = new Scanner(System.in);

            //Produtos
            Sabonete Sabonete1 = new Sabonete("4,99", "Cheirin", 319384, "12/04/2025", "Du bom", "Higiene", "Rosas", "Rosa");
            Bread Bread1 = new Bread("7,99", "Pão Bom", 647892, "20/05/2024", "Caseirin", "Padaria", "Forma", false);
            Detergente Detergente1 = new Detergente("4,50", "Sujol", 13141, "23/08/2028", "Imundol", "Limpeza", "Limão");
            Suco Suco1 = new Suco("7,50", "Cajuzin", 27324, "15/04/2025", "Sucos Nat", "Bebidas", "Caju", true, "1,75L");
            Coffee Coffee1 = new Coffee("5,40", "Cafez", 757398, "12/06/2024", "Cafeito", "Cafés/Chás", "Forte", "Grande");

            //Menu
            System.out.println("------------------\n| MERCADO +Q BOM |\n--------------------------------");
            System.out.println("|Selecione uma opção:           |\n|1.Ver todos os produtos        |\n|2.Ver todos os funcionários    |\n|3.Buscar produto por código    |\n|4.Buscar funcionário por código|");
            System.out.println("|_______________________________|");
            option = in.nextInt();


            switch (option){
                    case 1:
                            //Mostra todos os produtos
                            System.out.println("1.Ver todos os produtos");
                            System.out.println(Bread1);
                            System.out.println(Coffee1);
                            System.out.println(Detergente1);
                            System.out.println(Sabonete1);
                            System.out.println(Suco1);
                            break;
                    case 2:
                            //Mostra todos os funcionários
                            System.out.println("2.Ver todos os funcionários");
                            System.out.println(Worker1);
                            System.out.println(Worker2);
                            System.out.println(Worker3);
                            System.out.println(Worker4);
                            break;
                    case 3:
                            //Buscar pelo product_Code
                            System.out.println("3.Buscar produto por código");
                            System.out.println("Digite um código de produto para buscar:");
                            search = in.nextInt();

                            if(search == Bread1.getProduct_Code()) {
                                    System.out.println(Bread1);
                            } else if (search == Coffee1.getProduct_Code()) {
                                    System.out.println(Coffee1);
                            } else if (search == Detergente1.getProduct_Code()) {
                                    System.out.println(Detergente1);
                            } else if (search == Sabonete1.getProduct_Code()) {
                                    System.out.println(Sabonete1);
                            } else if (search == Suco1.getProduct_Code()) {
                                    System.out.println(Suco1);
                            } else {
                                    //product_Code não encontrado
                                    System.out.println("Produto não encontrado!");
                            }
                            break;
                    case 4:
                            // Buscar funcionário pelo ID
                            System.out.println("4.Buscar funcionário por código");
                            System.out.println("Digite um ID para buscar um funcionário:");
                            search = in.nextInt();

                            if(search == Worker1.getID()){
                                    System.out.println(Worker1);
                            } else if (search == Worker2.getID()){
                                    System.out.println(Worker2);
                            } else if (search == Worker3.getID()){
                                    System.out.println(Worker3);
                            } else if (search == Worker4.getID()){
                                    System.out.println(Worker4);
                            } else {
                                    //ID não existe
                                    System.out.println("Funcionário não encontrado!");
                            }
                            break;
                    default:
                            //Opção não existe no menu
                            System.out.println("Opção inválida!");
                            break;
            }
        }
    }
