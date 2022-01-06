package map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		Map<String, String> aluno = new HashMap<>();
		
		
		aluno.put("nome", "joao");
		aluno.put("idade", "17");
		aluno.put("faculdade", "Ifms");
		aluno.put("Turma", "5° Semestre");
		
		System.out.println(aluno);
	}
	
	
}
