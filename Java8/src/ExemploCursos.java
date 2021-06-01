import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}

public class ExemploCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		System.out.println("Ordenação pelo nº de alunos:");
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		cursos.forEach(c -> System.out.println(c.getNome()));
		System.out.println();


		System.out.println("Cursos com mais de 100 alunos:");
		cursos.stream()
			.filter( c -> c.getAlunos() >=100)
			.forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		
		
		System.out.println("Quantos alunos tem em cada curso:");
		cursos.stream()
			.map(c -> c.getAlunos())
			.forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("Algum curso que tenha mais de 100 alunos:");
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));
		System.out.println();
		
		
		System.out.println("Quantos alunos têm nos cursos com +100 alunos?");
		cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(
							c -> c.getNome(), 
							c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " 
						+ alunos + " alunos" ));
		System.out.println();
	
		
		System.out.println("Média de alunos:");
		cursos.stream()
		    .mapToInt(c -> c.getAlunos())
		    .average()
		    .ifPresent(System.out::println);
		System.out.println();
	}
}
