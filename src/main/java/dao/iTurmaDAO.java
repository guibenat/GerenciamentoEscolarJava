package dao;

import model.Aluno;
import  model.Turma;

import java.util.List;

public interface iTurmaDAO {
  public List<Aluno> listarAlunos();
  public List<Turma> listarTurmas(int id);


}
