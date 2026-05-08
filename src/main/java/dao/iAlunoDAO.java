package dao;

import model.Aluno;

import java.util.List;

public interface iAlunoDAO{
    void salvar(Aluno aluno);

    List <Aluno> listarTodosAlunos();

    void atualizarAluno (Aluno aluno);

    void excluirAluno(int Id);

    void listarAlunoId(int id);
}
