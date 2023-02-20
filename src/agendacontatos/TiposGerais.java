package agendacontatos;

public class TiposGerais extends Registro {
    
    public int idTiposGerais;
    public String valor;//Pode ser pessoa fisica ou juridica
    public String categoria;// Tipo da pessoa/ tipo endereço / tipo email....

    public TiposGerais(String valor, String categoria) {
        super(idRegistro);
        this.idTiposGerais = idRegistro + 1;
        this.valor = valor;
        this.categoria = categoria;
    }
    
    public void imprimirDados(){
        System.out.println(this.idTiposGerais);
    }
    
}
