package pwo.lab10.flyweight;

public class Particle {

    private Context context;

    private State state;

    public Particle(final Context context, final State state) {
        this.context = context;
        this.state = state;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(final Context context) {
        this.context = context;
    }

    public State getState() {
        return state;
    }

    public void setState(final State state) {
        this.state = state;
    }

    @Override public String toString() {
        return "Particle{" +
            "context=" + context +
            ", state=" + state +
            '}';
    }
}
