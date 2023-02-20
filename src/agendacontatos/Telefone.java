package agendacontatos;

public class Telefone extends Registro {
    
    private int idPessoa;
    private int idTelefone;
    private String numeroFone;

    public Telefone(int idPessoa, String numeroFone) {
        super(idRegistro);
        this.idPessoa = idPessoa;
        this.idTelefone = idRegistro;
        this.numeroFone = numeroFone;
    }

    
    public int getIdPessoa() {
        return idPessoa;
    }
    
    public int getIdTelefone() {
        return idTelefone;
    }

    public String getNumeroFone() {
        return numeroFone;
    }

    public void setNumeroFone(String numeroFone) {
        this.numeroFone = numeroFone;
    }
    
    
    
    
    
}
