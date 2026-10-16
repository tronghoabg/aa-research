package androidx.compose.runtime;

import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComputedValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;
    private final l<CompositionLocalAccessorScope, T> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ComputedValueHolder(l<? super CompositionLocalAccessorScope, ? extends T> lVar) {
        this.compute = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComputedValueHolder copy$default(ComputedValueHolder computedValueHolder, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = computedValueHolder.compute;
        }
        return computedValueHolder.copy(lVar);
    }

    public final l<CompositionLocalAccessorScope, T> component1() {
        return this.compute;
    }

    public final ComputedValueHolder<T> copy(l<? super CompositionLocalAccessorScope, ? extends T> lVar) {
        return new ComputedValueHolder<>(lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComputedValueHolder) && x.n(this.compute, ((ComputedValueHolder) obj).compute);
    }

    public final l<CompositionLocalAccessorScope, T> getCompute() {
        return this.compute;
    }

    public int hashCode() {
        return this.compute.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.compute.invoke(persistentCompositionLocalMap);
    }

    @Override // androidx.compose.runtime.ValueHolder
    public ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal) {
        return new ProvidedValue<>(compositionLocal, null, false, null, null, this.compute, false);
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.compute + ')';
    }
}
