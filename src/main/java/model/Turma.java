package model;

public class Turma {
    private int idTurma;
    private int idInstituicao;
    private int idProfessor;
    private String nome;
    private short ano_letivo;
    private String turno;
    private int vagas;

    public Turma(int idTurma, int idInstituicao, int idProfessor, String nome, short ano_letivo, String turno, int vagas) {
        this.idTurma = idTurma;
        this.idInstituicao = idInstituicao;
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.ano_letivo = ano_letivo;
        this.turno = turno;
        this.vagas = vagas;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public int getIdInstituicao() {
        return idInstituicao;
    }

    public void setIdInstituicao(int idInstituicao) {
        this.idInstituicao = idInstituicao;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getAno_letivo() {
        return ano_letivo;
    }

    public void setAno_letivo(short ano_letivo) {
        this.ano_letivo = ano_letivo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return String.format(
                "Turma: id=%d - ano_letivo=%f - turno=%s - vagas=%s",
                idTurma,nome,ano_letivo,turno,vagas
        );
    }
}



// --- Getters e Setters ---

