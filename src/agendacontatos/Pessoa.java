package agendacontatos;

import java.util.Calendar;
import java.util.Date;

public class Pessoa extends Registro {

    public int idPessoa;
    private String nome;
    private String nascimento;
    private String tipoPessoa;
    private String numeroInscricao;

    public Pessoa(String nome, String nascimento, String tipoPessoa,
                String numeroInscricao) {
        super(idRegistro);
        this.idPessoa = idRegistro + 1;
        this.nome = nome;
        this.nascimento = nascimento;
        this.tipoPessoa = tipoPessoa;
        this.numeroInscricao = numeroInscricao;
    }

    public void setNome(String nome) {
        if (nome.length() < 3) {
            this.nome = "Invalido";
        } else {
            this.nome = nome;
        }
    }

    public void setNumeroInscricao(String numeroInscricao) {
        if (this.numeroInscricao.length() != 11 || this.numeroInscricao.length() != 14
                    || this.numeroInscricao.matches("^(\\d)\\1{10}")) {
            this.numeroInscricao = "Inválido";
        } else {
            this.numeroInscricao = numeroInscricao;
        }
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    
    public String getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNascimento() {
        return nascimento;
    }

    public int getIdPessoa() {
        return idPessoa;
    }
    
    
    
    


}
