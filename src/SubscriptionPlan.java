public enum SubscriptionPlan {
    BASIC_PLAN(3),
    PREMIUM_PLAN(-1);

    private final int limiteCursos;

    SubscriptionPlan(int limiteCursos) {
        this.limiteCursos = limiteCursos;
    }

    public int getLimiteCursos() {
        return limiteCursos;
    }

    public boolean permiteNovaMatricula(int quantidadeAtual) {
        return limiteCursos == -1 || quantidadeAtual < limiteCursos;
    }
}
