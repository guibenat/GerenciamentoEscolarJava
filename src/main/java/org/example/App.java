package org.example;
import daoInplements.AlunoDaoImplements;
import database.sqlConn;

import model.Aluno;

import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        sqlConn.testConnection();

        AlunoDaoImplements dao = new AlunoDaoImplements();

        System.out.println(dao.listarTodosAlunos());
        Scanner sc = new Scanner(System.in);


        int opcao;


        do {
            System.out.println("MENU");
            System.out.println("[1] Cadastrar aluno");
            System.out.println("[2] Atualizar aluno");
            System.out.println("[3] Excluir aluno");
            System.out.println("[4] Listar aluno");
            System.out.println("[5] Sair do programa");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("[1] Cadastrar aluno");
                    break;
                case 2:
                    System.out.println("[2] Atualizar aluno");
                    break;
                case 3:
                    System.out.println("[3] Excluir aluno");
                    break;
                case 4:
                    System.out.println("[4] Listar aluno");
                    List<Aluno> todosAlunos = dao.listarTodosAlunos();
                    if (todosAlunos.isEmpty()){
                        System.out.println("Nenhum aluno encontrado");
                    } else {
                            for (Aluno aluno : todosAlunos){
                                System.out.println(aluno);
                            }
                     }
                    break;
                case 5:
                    System.out.println("[5] Cadastro aluno");
                    break;
            }
        } while (opcao != 0);
        }
    }


