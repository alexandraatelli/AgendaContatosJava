package agendacontatos;

public class Endereco extends Registro{
    
    private int idPessoa;
    private int idEndereco;
    private String rua; 
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(int idPessoa,String rua, int numero, String complemento, String  bairro, String cidade, 
                String estado, String cep) {
        super(idRegistro);
        this.idEndereco = idRegistro;
        this.idPessoa = idPessoa;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
 public int getIdPessoa() {
        return idPessoa;
    }
 
    public String getRua() {
        return rua;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String Endereco(){
        return "Endereço: " + rua + "n. " + numero + "- Complemento " + 
                    complemento + ". Bairro " + bairro + ". Cidade de " 
                    + cidade + ". Estado de " + estado + ". CEP: " + cep;
                    
    }

}
    
    


   
    
    

