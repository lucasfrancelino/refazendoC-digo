package com.company;

import constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Professor {

    private String nomeProfessor;
    private String resultado;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getMediaNota(){
        double somaNota = 0.0;
        for (Disciplina disciplina: disciplinas) {
            somaNota += disciplina.getNota();
        }
        return somaNota/disciplinas.size();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(nomeProfessor, professor.nomeProfessor) &&
                Objects.equals(disciplinas, professor.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeProfessor, disciplinas);
    }
}
