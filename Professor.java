class Professor {
    String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
}

class Disciplina {
    String nome;
    Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }
}

class Estudante {
    String nome;
    Disciplina disciplina;

    public Estudante(String nome, Disciplina disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void mostrarInfo() {
        System.out.println("Estudante: " + nome);
        System.out.println("Disciplina: " + disciplina.nome);
        System.out.println("Professor: " + disciplina.professor.nome);
    }
}
