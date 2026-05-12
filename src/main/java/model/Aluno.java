package model;
import java.time.LocalDate;

public class Aluno {
    private int idAluno;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate data_nascimento;
    private String telefone;

    public Aluno (int idAluno, String nome, String email, String cpf, LocalDate data_nascimento, String telefone){
        this.idAluno = idAluno;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
    }
    public Aluno (String nome, String email, String cpf, LocalDate data_nascimento, String telefone){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
    }

    public Aluno(int idAtualizar, String novoNome, String novoEmail) {
    }


    public int getId() {
        return idAluno;
    }
    public void setId(int id) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return String.format(
                "Aluno: id=%d - nome=%s - email=%s - cpf=%s - nascimento=%s",
                idAluno,nome,email,cpf,data_nascimento
        );
    }
}
