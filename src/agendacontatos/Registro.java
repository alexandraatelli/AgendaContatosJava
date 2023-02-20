package agendacontatos;

    abstract class Registro {
    
    static int idRegistro = 0;
    
    public Registro(int idRegistro){
        Registro.idRegistro += 1;
    }
 
}
    

