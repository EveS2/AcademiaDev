import java.util.Set;
import java.util.HashSet;

public class Student extends Users{
    private SubscriptionPlan subs;
    private Set<Courses> cursos = new HashSet<>();

    public Student(String name, String email, SubscriptionPlan subs) {
        super(name, email);
        this.subs = subs;
    }

    public void matricularEmCurso(Courses curso) {
        if (curso.getStatus() == StatusCurso.ACTIVE && this.cursos.size() < this.subs.getLimiteCursos()) {
            this.cursos.add(curso);
            System.out.println("\nMatrícula realizada com sucesso!\n"
            + getName() + "matriculado no curso " + curso.getTitle() + ".\n");
        } else {
            throw new IllegalArgumentException("\nMatrícula não realizada!\nCurso inativo ou plano ultrapassou o limite de matrículas!\n");
        }
    }
}
