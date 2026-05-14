package dao;

import model.Aluno;

import java.util.List;
import java.util.Optional;

public interface iAlunoDAO{
    void salvar(Aluno aluno);

    List <Aluno> listarTodosAlunos();

    void atualizarAluno (Aluno aluno);

    void excluirAluno(int Id);

    Optional <Aluno> buscarId(int id);


}
