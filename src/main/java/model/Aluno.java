package model;
import java.time.LocalDate;

public class Aluno {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate data_nascimento;
    private String telefone;

    public Aluno (String nome, String email, String cpf, LocalDate data_nascimento, String telefone){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
                id,nome,email,cpf,data_nascimento
        );
    }
}
