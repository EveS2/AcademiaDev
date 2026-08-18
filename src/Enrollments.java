public class Enrollments {

    private Student student;
    private Courses curso; 
    private int progress = 0;

    public Enrollments(Student student, Courses curso) {
        this.student = student;
        this.curso = curso;
    }

    public Student getStudent() {
        return student;
    }

    public Courses getCurso() {
        return curso;
    }

    public int getProgresso() {
        return this.progress;
    }

    public void setProgresso(int progress) {
        this.progress = progress;
    }

    public void adicionarProgresso(int val) {
        if (val > 0) {
            this.progress = Math.min(this.progress + val, 100);
        } else {
            throw new IllegalArgumentException("Não são aceitos valores negativos.");
        }
    }
}