import java.util.Scanner;

import com.orientacaoobjetos.entity.Aluno;

public class OrientacaoAObjetosExercicio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = sc.nextInt();

        System.out.print("Digite a quantidade de provas: ");
        int quantidadeProvas = sc.nextInt();

        Aluno[] alunos = new Aluno[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {

            sc.nextLine();

            System.out.println("\nCadastro do aluno " + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            alunos[i] = new Aluno(nome, idade, quantidadeProvas);

            for (int j = 0; j < quantidadeProvas; j++) {

                double nota;

                do {

                    System.out.print("Digite a nota da prova " + (j + 1) + ": ");
                    nota = sc.nextDouble();

                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                    }

                } while (nota < 0 || nota > 10);

                alunos[i].setNota(j, nota);

            }
        }

        System.out.println("\n===== RESULTADO FINAL =====");

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("\nAluno: " + alunos[i].getNome());
            System.out.println("Idade: " + alunos[i].getIdade());

            double[] notas = alunos[i].getNotas();

            for (int j = 0; j < notas.length; j++) {
                System.out.println("Prova " + (j + 1) + ": " + notas[j]);
            }

            System.out.printf("Média: %.2f\n", alunos[i].calcularMedia());
        }

        sc.close();
    }
}
