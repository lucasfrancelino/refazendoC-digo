package com.company;

import constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Professor {

    private String nomeProfessor;

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
