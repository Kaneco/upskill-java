package aula06.trabalho.exercicio1;

public class Testes {

    public static void main(String[] args) {
        // Criar Salas
        Room room1 = new Room("A", 10, 22);
        Room room2 = new Room("B", 10, 23);
        // Criar Alunos
        Student aluno1 = new Student(12,"Joao Silva", "Literatura");
        Student aluno2 = new Student(9,"Anabela", "Desporto");
        Student aluno3 = new Student(2,"Ricardo", "Medicina");
        Student aluno4 = new Student(5,"Tiago Lopes", "Veterinaria");

        // Adicionar alunos criados à room1
        room1.addStudent(aluno1);
        room1.addStudent(aluno2);
        room1.addStudent(aluno3);
        room1.addStudent(aluno4);
        // Imprime informaçao da sala
        System.out.println(room1.toString());
        // Lista alunos na sala
        System.out.println("antes de remover");
        room1.listarAlunos();
        // Remove aluno
        System.out.println("remover");
        room1.removeAluno(aluno1);
        room1.listarAlunos();
    }
}
