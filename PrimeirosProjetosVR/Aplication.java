import java.util.List;
import java.util.ArrayList;

public class Aplication {

	public static void main(String[] args) {
		
		List<AlunoNota> listaDeAlunos = new ArrayList<>();
		listaDeAlunos.add(new AlunoNota(1, "Arnaldo", 8.2));
		listaDeAlunos.add(new AlunoNota(2, "Rafael", 7.4));
		listaDeAlunos.add(new AlunoNota(3, "Maria", 10));
		listaDeAlunos.add(new AlunoNota(4, "Everton", 6.5));
		listaDeAlunos.add(new AlunoNota(5, "Gabrielle", 9.0));
		listaDeAlunos.add(new AlunoNota(6, "Sabrina", 7));
		listaDeAlunos.add(new AlunoNota(7, "Jefferson", 9.5));
		listaDeAlunos.add(new AlunoNota(8, "Danilo", 9.5));
		listaDeAlunos.add(new AlunoNota(9, "Felipe", 9.2));
		listaDeAlunos.add(new AlunoNota(10, "Anderson", 9.8));
				
			AlunoNota alunoNota = new AlunoNota();			
			
			System.out.println("A média geral da sala é: " + (alunoNota.media(listaDeAlunos)) );
			
			System.out.println("O aluno com a maior nota é: " + alunoNota.notaMaior(listaDeAlunos));
			
			System.out.println("O aluno com a Menor nota é: " + alunoNota.notaMenor(listaDeAlunos));
	}
}
