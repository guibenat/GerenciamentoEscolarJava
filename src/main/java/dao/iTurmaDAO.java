package dao;

import model.Aluno;
import  model.Turma;

import java.util.List;

public interface iTurmaDAO {

  List<Turma> listarTodasTurmas();

  List<Aluno> listarAlunosPorTurmaID(int turmaId);
}
