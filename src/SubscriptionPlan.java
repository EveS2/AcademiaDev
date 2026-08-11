public enum SubscriptionPlan {
    BasicPlan(3), 
    PremiumPlan(Integer.MAX_VALUE);

    private final int limiteCursos;

    private SubscriptionPlan(int limiteCursos) {
        this.limiteCursos = limiteCursos;
    }

    public int getLimiteCursos() {
        return this.limiteCursos;
    }
}
