package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class UnboxedDoubleState implements DoubleState {
    public static final int $stable = 0;
    private final State<Double> baseState;

    public UnboxedDoubleState(State<Double> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.DoubleState
    public double getDoubleValue() {
        return this.baseState.getValue().doubleValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public Double getValue() {
        return this.baseState.getValue();
    }

    public String toString() {
        return "UnboxedDoubleState(baseState=" + this.baseState + ")@" + hashCode();
    }
}
