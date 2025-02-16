public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco (String rua, int numero, String bairro, String cidade, String uf, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }
    public String getRua () {
        return rua;
    }
    public void setRua (String rua) {
        this.rua = rua;
    }
    public int getNumero () {
        return numero;
    }
    public void setNumero (int numero) {
        this.numero = numero;
    }
    public String getBairro () {
        return bairro;
    }
    public void setBairro (String bairro) {
        this.bairro = bairro;
    }
    public String getCidade () {
        return cidade;
    }
    public void setCidade (String cidade) {
        this.cidade = cidade;
    }
    public String getUf () {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCep () {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void exibirEndereco () {
        System.out.println("Rua: " + rua);
        System.out.println("N: " + numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade + " - " + uf.toUpperCase() + ".");
        System.out.println("CEP: " + cep);
    }
}

