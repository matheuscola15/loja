import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cliente cliente = new cliente();

        System.out.print("Informe o nome do cliente: ");
        cliente.nome = sc.next();

        System.out.print("Informe a idade do cliente: ");
        cliente.idadec = sc.nextInt();

        System.out.print("Informe a cidade do cliente: ");
        cliente.cidade = sc.next();

        System.out.println("----------------------------------------");
        System.out.println("Informações do cliente || " + cliente.getCliente());
        System.out.println("----------------------------------------");

        /*--*/

        cliente produto = new cliente();
        System.out.print("Informe o nome do produto: ");
        cliente.nomep = sc.next();

        System.out.print("Informe o valor do produto: ");
        cliente.valor = sc.nextDouble();

        System.out.print("Informe a marca do produto: ");
        cliente.marca = sc.next();

        System.out.println("----------------------------------------");
        System.out.println("Informações do produto || " + cliente.getProduto());
        System.out.println("----------------------------------------");

        /*--*/

        cliente vendedor = new cliente();
        System.out.print("Informe o nome do vendedor: ");
        cliente.nomev = sc.next();

        System.out.print("Informe a idade do vendedor: ");
        cliente.idadev = sc.nextInt();

        System.out.println("----------------------------------------");
        System.out.println("Informações do vendedor || " + cliente.getVendedor());
    }
}
