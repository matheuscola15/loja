public class cliente {
    String nome, cidade;
    int idadec;
    public String getCliente(){
        String cliente = "Nome: "+ nome + " || Idade: " + idadec + " || Cidade: " + cidade;
        return cliente;
    }

    /*--*/

    String nomep;
    String marca;
    double valor;
    public String getProduto() {
        String produto = "Nome do produto: " + nomep + " || Valor do produto: " + valor + " || Marca do produto: " + marca;
        return produto;
    }

    String nomev;
    int idadev;

    public String getVendedor() {
        String vendedor = "Nome do vendedor: " + nomev + " || Idade do vendedor: " + idadev;
        return vendedor;
    }
}
