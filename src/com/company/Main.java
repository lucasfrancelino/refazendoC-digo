package com.company;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        List<Aluno> alunos = new ArrayList<Aluno>();
            for(int quantidadeAluno = 0; quantidadeAluno <= 1; quantidadeAluno++) {
                Aluno aluno = new Aluno();
                Scanner entrada = new Scanner(System.in);

                String nome;
                System.out.println("Qual o nome do estudante: "+quantidadeAluno);
                nome = entrada.nextLine();

                aluno.setNome(nome);

                for (int qtdDisciplina = 1; qtdDisciplina <= 1; qtdDisciplina++){
                    Disciplina disciplina = new Disciplina();

                    String dis;

                    System.out.println("Qual a disciplina "+qtdDisciplina+" do estudante? ");
                    dis = entrada.nextLine();
                    disciplina.setDisciplina(dis);

                    double nota;

                    System.out.println("Qual a nota do estudante: ");
                    nota = Double.parseDouble(entrada.nextLine());
                    disciplina.setNota(nota);

                    aluno.getDisciplinas().add(disciplina);
                }

                alunos.add(aluno);
            }

        for (Aluno alunoLista : alunos){
            System.out.println("Nome do estudante é "+alunoLista.getNome());
                for (Disciplina disciplina: alunoLista.getDisciplinas()){
                    System.out.println("Suas Disciplinas são: "+ disciplina.getDisciplina());
            }
            System.out.println("A média do "+alunoLista.getNome()+" é de "+alunoLista.getMediaNota());
            System.out.println(alunoLista.situacaoAluno());
            System.out.println("---------------------------------------------------------------------");
        }
    }
}
