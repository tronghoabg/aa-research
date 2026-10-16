package androidx.compose.runtime;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DynamicValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;
    private final MutableState<T> state;

    public DynamicValueHolder(MutableState<T> mutableState) {
        this.state = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicValueHolder copy$default(DynamicValueHolder dynamicValueHolder, MutableState mutableState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutableState = dynamicValueHolder.state;
        }
        return dynamicValueHolder.copy(mutableState);
    }

    public final MutableState<T> component1() {
        return this.state;
    }

    public final DynamicValueHolder<T> copy(MutableState<T> mutableState) {
        return new DynamicValueHolder<>(mutableState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicValueHolder) && x.n(this.state, ((DynamicValueHolder) obj).state);
    }

    public final MutableState<T> getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.state.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal) {
        return new ProvidedValue<>(compositionLocal, null, false, null, this.state, null, true);
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.state + ')';
    }
}
