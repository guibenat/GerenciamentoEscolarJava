package daoInplements;
import dao.iAlunoDAO;
import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDaoImplements implements iAlunoDAO{

    @Override
    public void salvar(Aluno aluno) {

    }

    @Override
    public List<Aluno> listarTodosAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        return alunos;
    }

    @Override
    public void atualizarAluno(Aluno aluno) {

    }

    @Override
    public void excluirAluno(int Id) {

    }
}
