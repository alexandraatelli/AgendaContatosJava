package agendacontatos;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaMain {

    public static void main(String[] args) {

        //conexao com o meu Banco de Dados - Escopo Global - Esse banco de Dados é um objeto
        BancoDeDadosSimulacao bancoDeDados = new BancoDeDadosSimulacao();
        
        Scanner leitor = new Scanner(System.in);

        //bancoDeDados.Inserir(new TiposGerais("Celular", "TipoTelefone"));
        //System.out.println("Dados: " + bancoDeDados.tiposGerais.size());

        /*
        ArrayList dados = bancoDeDados.Select("TiposGerais", "TipoPessoa");
        for (int i = 0; i < dados.size(); i++) {
            System.out.println(bancoDeDados.tiposGerais.get((int) dados.get(i)).valor);
         
        }*/
        
        /*
        ArrayList dados = bancoDeDados.Select("Pessoa", "11111111111");
        System.out.println(dados.size());
        System.out.println("Dados: " + bancoDeDados.pessoas.size());
        for (int i = 0; i < dados.size(); i++) {
            System.out.println(bancoDeDados.pessoas.get((int) dados.get(i)).getNumeroInscricao());

        }*/

        /*
        ArrayList dados = bancoDeDados.Select("Endereco", "2");
        System.out.println(dados.size());
        System.out.println("Dados: " + bancoDeDados.enderecos.size());
 
        for (int i = 0; i < dados.size(); i++) {
            System.out.println(bancoDeDados.enderecos.get((int) dados.get(i)).idPessoa);

        }*/
        
        /*
        ArrayList dados = bancoDeDados.Select("Telefone", "1");
        System.out.println(dados.size());
        System.out.println("Dados: " + bancoDeDados.telefones.size());

        for (int i = 0; i < dados.size(); i++) {
            System.out.println(bancoDeDados.telefones.get((int) dados.get(i)).idPessoa);

        }*/
        
        /*
        ArrayList dados = bancoDeDados.Select("Email", "2");
        System.out.println(dados.size());
        System.out.println("Dados: " + bancoDeDados.emails.size());

        for (int i = 0; i < dados.size(); i++) {
            System.out.println(bancoDeDados.emails.get((int) dados.get(i)).idPessoa);

        }
       System.out.println(bancoDeDados.ImprimiDados("Pessoa", "11111111111", "id"));
       System.out.println(bancoDeDados.ImprimiDados("Pessoa", "11111111111", "completo"));
    
       System.out.println(bancoDeDados.ImprimiDados("Endereco",bancoDeDados.ImprimiDados("Pessoa", "11111111111", "id"),  "completo"));
     
       System.out.println(bancoDeDados.ImprimiDados("Telefone",bancoDeDados.ImprimiDados("Pessoa", "11111111111", "id"),  "completo"));
       System.out.println(bancoDeDados.ImprimiDados("Telefone",bancoDeDados.ImprimiDados("Pessoa", "22222222222", "id"),  "completo"));
    
       System.out.println(bancoDeDados.ImprimiDados("Email",bancoDeDados.ImprimiDados("Pessoa", "11111111111", "id"),  "completo"));
       System.out.println(bancoDeDados.ImprimiDados("Email",bancoDeDados.ImprimiDados("Pessoa", "22222222222", "id"),  "completo"));
    */
        
        String nome;
        String nascimento;
        String tipoPessoa;
        String numeroInscricao;
        

        String continua = "s";
        
       //bancoDeDados.Remove("Email", bancoDeDados.ImprimiDados("Pessoa", "111", "id"), "completo");
       //System.out.println(bancoDeDados.ImprimiDados("Email", bancoDeDados.ImprimiDados("Pessoa", "111", "id"), "completo"));
       
        //System.out.println(bancoDeDados.ImprimiDados("TiposGerais", "TipoPessoa", "completo"));
         //System.out.println(bancoDeDados.ImprimiDados("Endereco", bancoDeDados.ImprimiDados("Pessoa", "111", "id"), "completo"));
       
         
         //bancoDeDados.Remove("Pessoa", bancoDeDados.ImprimiDados("Pessoa", "111", "id"), "id");
        
        //System.out.println(bancoDeDados.ImprimiDados("Pessoa", "111", "id"));
        
        //bancoDeDados.Remove("Endereco", bancoDeDados.ImprimiDados("Pessoa", "111", "id"), "completo");
        
        
        //System.out.println(bancoDeDados.ImprimiDados("Endereco", bancoDeDados.ImprimiDados("Pessoa", "111", "id") , "completo"));
        
        while(continua.equalsIgnoreCase("s")){
        
        
        System.out.println("**********Agenda de Contato**********");
        
        System.out.println("Digite a opção desejada: \n" +
                    "1 - Inserir \n" + 
                    "2 - Imprimir Dados \n" +
                    "3 - Remover \n" +
                    "4 - Atualizar \n" +
                    "5 - Sair do Sistema \n");
        
        int opcao = 0;
        opcao = leitor.nextInt();
        leitor.nextLine();
                     
        switch (opcao){
            case 1:
               System.out.println("Digite o nome: ");
               nome = leitor.nextLine();
               System.out.println("Digite a data de nascimento: ");
               nascimento = leitor.nextLine();
               System.out.println("Digite o Tipo de Pessoa: Fisica ou Juridica: "); 
               tipoPessoa = leitor.nextLine();
               System.out.println("Digite o numero de inscrição: ");
               numeroInscricao = leitor.nextLine();
               bancoDeDados.Inserir(new Pessoa(nome, nascimento, tipoPessoa, numeroInscricao));
               // Aqui para inserir demais dados será feito via while.
               break;
            case 2:
                System.out.println("Digite o número do documento: ");
                numeroInscricao = leitor.nextLine();
                System.out.println(bancoDeDados.ImprimiDados("Pessoa", numeroInscricao, "completo"));
                System.out.println(bancoDeDados.ImprimiDados("Endereco", bancoDeDados.ImprimiDados("Pessoa", numeroInscricao, "id"), "completo"));
                System.out.println(bancoDeDados.ImprimiDados("Telefone", bancoDeDados.ImprimiDados("Pessoa", numeroInscricao, "id"), "completo"));
                System.out.println(bancoDeDados.ImprimiDados("Email", bancoDeDados.ImprimiDados("Pessoa", numeroInscricao, "id"), "completo"));
                break;
            case 3:
                System.out.println("Digite o número do documento: ");
                numeroInscricao = leitor.nextLine();
                 bancoDeDados.Remove("Email", bancoDeDados.ImprimiDados("Pessoa", numeroInscricao, "id"), "completo");
                bancoDeDados.Remove("Telefone", bancoDeDados.ImprimiDados("Pessoa", numeroInscricao, "id"), "completo");
                bancoDeDados.Remove("Endereco", bancoDeDados.ImprimiDados("Pessoa", numeroInscricao, "id"), "completo");
                bancoDeDados.Remove("Pessoa", bancoDeDados.ImprimiDados("Pessoa", numeroInscricao, "id"), "completo");
                break;
            case 5:
                System.exit(0);
      
        }
            System.out.println("Deseja continuar? S -> sim || N -> não");
            continua = leitor.next();
        }
    
    }
}

   