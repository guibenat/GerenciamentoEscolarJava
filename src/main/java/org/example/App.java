package org.example;

import daoInplements.AlunoDaoImplements;
import database.sqlConn;
import model.Aluno;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Testa a conexão inicial
        sqlConn.testConnection();

        AlunoDaoImplements dao = new AlunoDaoImplements();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU DE GERENCIAMENTO");
            System.out.println("[1] Cadastrar aluno");
            System.out.println("[2] Atualizar aluno");
            System.out.println("[3] Excluir aluno");
            System.out.println("[4] Listar todos os alunos");
            System.out.println("[0] Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n Cadastrar Novo Aluno");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.println("Cpf: ");
                    String cpf = sc.nextLine();
                    System.out.println("Data de nascimento");
                    LocalDate data_nascimento = null;
                    try{
                        data_nascimento = LocalDate.parse(sc.nextLine());
                    } catch (DateTimeParseException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Insita seu telefone");
                    String telefone = sc.nextLine();

                    Aluno novoAluno = new Aluno(nome,email, cpf, data_nascimento, telefone);
                    dao.salvar(novoAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n Atualizar Aluno");
                    System.out.print("Digite o ID do aluno que deseja atualizar: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Novo Nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo Email: ");
                    String novoEmail = sc.nextLine();

                    Aluno alunoAtualizado = new Aluno(idAtualizar, novoNome, novoEmail);
                    dao.atualizarAluno(alunoAtualizado);
                    System.out.println("Dados atualizados!");
                    break;

                case 3:
                    System.out.println("\n Excluir Aluno");
                    System.out.print("Digite o ID do aluno para excluir: ");
                    int idExcluir = sc.nextInt();

                    dao.excluirAluno(idExcluir);
                    System.out.println("Aluno removido com sucesso!");
                    break;

                case 4:
                    System.out.println("\n Lista de Alunos:");
                    List<Aluno> todosAlunos = dao.listarTodosAlunos();
                    if (todosAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno encontrado no banco de dados.");
                    } else {
                        for (Aluno aluno : todosAlunos) {
                            System.out.println(aluno);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}


