package daoInplements;
import dao.iAlunoDAO;
import database.sqlConn;
import model.Aluno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlunoDaoImplements implements iAlunoDAO{


    @Override
    public void salvar(Aluno aluno) {
        String sql = "INSERT INTO Aluno = (nome, cpf, email, data_nascimento, telefone) VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection conn = sqlConn.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, aluno.getNome());
            stmt.setString(2,aluno.getCpf());
            stmt.setString(3,aluno.getEmail());
            stmt.setDate(4, Date.valueOf(aluno.getData_nascimento()));
            stmt.setString(5,aluno.getTelefone());

            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next()) {
                aluno.setId(chaves.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Aluno> listarTodosAlunos() {
        String sql = "SELECT * FROM Aluno ORDER BY nome ASC";
        List<Aluno> alunos = new ArrayList<>();

        try (Connection conn = sqlConn.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                alunos.add(new Aluno(
                        rs.getInt("idAluno"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getDate("data_nascimento").toLocalDate(),
                        rs.getString("telefone")
                ));
            }
        } catch (SQLException e){
            System.err.println("Conexão mal sucedida." + e.getMessage());
        }
        return alunos;
    }

    @Override
    public void atualizarAluno(Aluno aluno) {
        String sql =  "UPDATE Aluno SET nome = ?, cpf = ?, email = ?, data_nascimento = ?, telefone = ? WHERE id = ?";

        try (Connection conn = sqlConn.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, aluno.getNome());
            stmt.setString(2,aluno.getCpf());
            stmt.setString(3,aluno.getEmail());
            stmt.setDate(4, Date.valueOf(aluno.getData_nascimento()));
            stmt.setString(5,aluno.getTelefone());
            stmt.setInt(6, aluno.getId());

            int linhas = stmt.executeUpdate();

            if (linhas > 0) {
                System.out.println("Aluno atualizado com sucesso");
            } else{
                System.out.println("Aluno não encontrado");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            }
    }

    @Override
    public void excluirAluno(int id) {

    }

    @Override
    public Optional<Aluno> buscarId(int id) {
        String sql = "SELECT * FROM Aluno WHERE = ?";

        try (Connection conn = sqlConn.getConnection()){
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();

            if (rs.next()){
                Aluno alunos = new Aluno(
                        rs.getInt("idAluno"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getDate("data_nascimento").toLocalDate(),
                        rs.getString("telefone")
                );
                return Optional.of(alunos);
            }
        } catch (SQLException ex) {
             System.err.println("Nenhum aluno encrontrado");
            }
        return Optional.empty();
    }
}
