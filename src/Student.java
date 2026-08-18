import java.util.Set;
import java.util.HashSet;

public class Student extends Users{
    private SubscriptionPlan subs;
    private Set<Enrollments> enrollments = new HashSet<>();

    public Student(String name, String email, SubscriptionPlan subs) {
        super(name, email);
        this.subs = subs;
    }

    public void matricularEmCurso(Courses curso) {
        if (curso == null) {
            throw new IllegalArgumentException("O curso não pode ser nulo.");
        }
    
        if (curso.getStatus() != StatusCurso.ACTIVE) {
            throw new IllegalArgumentException("Matrícula não realizada: curso inativo.");
        }
    
        if (!subs.permiteNovaMatricula(enrollments.size())) {
            throw new IllegalArgumentException(
                "Matrícula não realizada: limite do plano atingido."
            );
        }

        for (Enrollments enrollment : enrollments) {
            if (enrollment.getCurso().equals(curso)) {
                throw new IllegalArgumentException(
                    "O aluno já está matriculado nesse curso."
                );
            }
        }
    
        Enrollments enrollment = new Enrollments(this, curso);
        enrollments.add(enrollment);

    
        System.out.println(
            "\n\nMatrícula realizada com sucesso!\n"
            + getName() + " matriculado no curso " + curso.getTitle() + ".\n"
        );
    }
    
}
