package androidx.compose.runtime;

import h.e;
import h.f;
import h.g;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 8;
    private final f current$delegate;

    public LazyValueHolder(a<? extends T> aVar) {
        this.current$delegate = g.a(aVar);
    }

    private final T getCurrent() {
        return (T) this.current$delegate.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return getCurrent();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal) {
        ComposerKt.composeRuntimeError("Cannot produce a provider from a lazy value holder");
        throw new e();
    }
}
