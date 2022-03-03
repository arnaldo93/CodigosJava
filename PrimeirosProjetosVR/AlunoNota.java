import java.util.List;
public class AlunoNota {
	
	private int id;
	private String nome ;
	private double nota;
	
	public AlunoNota(int id, String nome, double nota) {
		this.id = id;
		this.nome = nome;
		this.nota = nota;				
	}
	
	public AlunoNota() {		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "AlunoNota [id=" + id + ", nome=" + nome + ", nota=" + nota + "]";
			
	}
	
	public AlunoNota notaMaior(List<AlunoNota>alunoNota) {
			double nota = 0;
			int posicao = 0;
			
		for(int i =0;i< alunoNota.size();i++) {
			
			if(alunoNota.get(i).getNota()>nota) {
				
				nota = alunoNota.get(i).getNota();
				posicao = i;
			}
			
		}
			
		return alunoNota.get(posicao);
	}
	
	public double media(List<AlunoNota>alunoNota) {
			
			double mediaNotas = 0;
		for(int i =0;i< alunoNota.size();i++) {
			mediaNotas =mediaNotas + alunoNota.get(i).getNota();
					
		}
		return mediaNotas/alunoNota.size();
	}
	
	public AlunoNota notaMenor(List<AlunoNota>alunoNota) {
		
		int posicao = 0;
		double nota = 10;
	for(int i =0;i< alunoNota.size();i++) {
		
		if(alunoNota.get(i).getNota()<nota) {
			
			nota = alunoNota.get(i).getNota();
			posicao = i;
		}
		
	}
	
	return alunoNota.get(posicao);
		
	}
	
}
