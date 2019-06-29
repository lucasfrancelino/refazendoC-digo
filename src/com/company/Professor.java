package com.company;

import java.util.ArrayList;
import java.util.List;

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

    public double getMediaNota(){
        double somaNota = 0.0;
        for (Disciplina disciplina: disciplinas) {
            somaNota += disciplina.getNota();
        }
        return somaNota/disciplinas.size();
    }


}
