package app;

public class OrdenarAlunos {
	private final CadastroAlunos calunos;
	private Aluno resposta[];
	private String matricula1;
	private String matricula2;
	Aluno t;
	
	
	OrdenarAlunos(CadastroAlunos source){
		calunos = source;
	}
	
	
	public Aluno[] ordenarAlunos() {
		resposta = new Aluno[calunos.alunos.length];
		//copia o vetor para o vetor de resposta
		for (int i=0; i < calunos.alunos.length; i++) {
			resposta[i] = calunos.alunos[i]; 
		}
		
		for (int i = 0; i < resposta.length - 1; i++) {
			for (int j = i; j < resposta.length; j++) {
				matricula1 = calunos.getCodeMatricula(resposta, i);
				matricula2 = calunos.getCodeMatricula(resposta, j);
				if (matricula1.compareTo(matricula2) > 0) {
					t = resposta[i]; 
					resposta[i] = resposta[j];
					resposta[j] = t;
				}
			}
		}
		
		return resposta;
	}
}