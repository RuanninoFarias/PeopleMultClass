public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("da Cafelândia", 22,
                "Melicidade", "Java", "SP", "66600666");
        Pessoa pessoa = new Pessoa("Maria", "01422234080", endereco);
        pessoa.setNome("João");
        pessoa.exibirPessoa();
    }
}
