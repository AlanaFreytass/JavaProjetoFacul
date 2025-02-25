package Control;

import Model.Aluno;
import java.util.ArrayList;

public class AlunoControl {

    private final Aluno control;

    public AlunoControl() {
        this.control = new Aluno();
    }

    // Create 
    public boolean Cadastrar(String curso, int fase, String nome, int idade) {

        // AlunoControl recebe os dados da VIEW, cria um objeto COMPLETO e manda este objeto para aluno para inserir em MinhaLista(DAO)
        // Aluno CONTROL NÃO DEVE ACESSAR DAO DIRETAMENTE. Lá em aluno deve ter uma função que acessa DAO para inserir. InsertAlunoBD()
        
        int id = control.maiorID() + 1;
        Aluno objeto = new Aluno(curso, fase, id, nome, idade);
        if(control.InsertAlunoBD(objeto)){
            return true;
        }else{
            return false;
        }
    }

    // Update
    public boolean Editar(String curso, int fase, int id, String nome, int idade) {
        Aluno objeto = new Aluno(curso, fase, id, nome, idade);
        if(control.UpdateAlunoBD(id, objeto)){
            return true;
        }else{
            return false;
        }
    }

    // Delete
    public boolean Apagar(int id) {
        if(control.DeleteAlunoBD(id)){
            return true;
        }else{
            return false;
        }
    }

    // Read
    public Aluno LoadAluno(int id) {
        // procurar o aluno com este id e retornar um objeto com TODOS OS DADOS.
        return control.carregaAluno(id);
    }

    // Read
    public ArrayList getMinhaLista() {
        return control.getMinhaLista();
    }
    
    @SuppressWarnings("unchecked")
    public String[][] getMinhaMatrizTexto() {
        
        ArrayList<Aluno> minhalista = control.getMinhaLista();
        int tamanho = minhalista.size();
        
        String MatrizAlunos[][] = new String[tamanho][5];
        for (int i = 0; i < tamanho; i++) {
            MatrizAlunos[i][0] = minhalista.get(i).getId() + "";
            MatrizAlunos[i][1] = minhalista.get(i).getNome();
            MatrizAlunos[i][2] = minhalista.get(i).getIdade() + "";
            MatrizAlunos[i][3] = minhalista.get(i).getCurso();
            MatrizAlunos[i][4] = minhalista.get(i).getFase() + "";
        }        
        
        return MatrizAlunos;        
    }
    
}
