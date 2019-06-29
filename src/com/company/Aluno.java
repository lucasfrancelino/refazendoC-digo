package com.company;

import constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    private String nome;
    private String resultado;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private List<Professor> professore = new ArrayList<Professor>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Professor> getProfessore() {
        return professore;
    }

    public void setProfessore(List<Professor> professore) {
        this.professore = professore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) &&
                Objects.equals(disciplinas, aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, disciplinas);
    }

    public double getMediaNota() {

        double somaNotas = 0.0;

        for (Disciplina disciplinaAluno : disciplinas ) {

            somaNotas += disciplinaAluno.getNota();
        }

        //.size() significa o tamanho do meu array, isso torma meu array dinâmico
        return somaNotas / disciplinas.size();
    }

    public String situacaoAluno(){
        if (getMediaNota() >= 7){
            resultado = StatusAluno.APROVADO;
        }

        if (getMediaNota() <= 6){
            resultado = StatusAluno.RECUPERACAO;
        }

        if (getMediaNota() <= 5){
            resultado = StatusAluno.REPROVADO;
        }
        return resultado;
    }
}
