package agendacontatos;

public class Email extends Registro{
    
    private int idPessoa;
    private int idEmail;
    private String email;

    public Email(int idPessoa, String email) {
        super(idRegistro);
        this.idPessoa = idPessoa;
        this.idEmail = idRegistro;
        this.email = email;
    }

    public int getIdPessoa() {
        return idPessoa;
    }
    
    public int getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
}
